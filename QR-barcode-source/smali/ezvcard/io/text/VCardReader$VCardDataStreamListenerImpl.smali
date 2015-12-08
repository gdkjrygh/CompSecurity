.class Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;
.super Ljava/lang/Object;
.source "VCardReader.java"

# interfaces
.implements Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/text/VCardReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "VCardDataStreamListenerImpl"
.end annotation


# instance fields
.field private embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

.field private final labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Label;",
            ">;"
        }
    .end annotation
.end field

.field private root:Lezvcard/VCard;

.field final synthetic this$0:Lezvcard/io/text/VCardReader;

.field private final vcardStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lezvcard/io/text/VCardReader;)V
    .locals 1

    .prologue
    .line 311
    iput-object p1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->labels:Ljava/util/List;

    .line 314
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    return-void
.end method

.method synthetic constructor <init>(Lezvcard/io/text/VCardReader;Lezvcard/io/text/VCardReader$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/io/text/VCardReader;
    .param p2, "x1"    # Lezvcard/io/text/VCardReader$1;

    .prologue
    .line 311
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;-><init>(Lezvcard/io/text/VCardReader;)V

    return-void
.end method

.method static synthetic access$100(Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;)Lezvcard/VCard;
    .locals 1
    .param p0, "x0"    # Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;

    .prologue
    .line 311
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->root:Lezvcard/VCard;

    return-object v0
.end method


# virtual methods
.method public beginComponent(Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 318
    const-string v1, "VCARD"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 337
    :cond_0
    :goto_0
    return-void

    .line 322
    :cond_1
    new-instance v0, Lezvcard/VCard;

    invoke-direct {v0}, Lezvcard/VCard;-><init>()V

    .line 325
    .local v0, "vcard":Lezvcard/VCard;
    sget-object v1, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    invoke-virtual {v0, v1}, Lezvcard/VCard;->setVersion(Lezvcard/VCardVersion;)V

    .line 327
    iget-object v1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 329
    iget-object v1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->root:Lezvcard/VCard;

    if-nez v1, :cond_2

    .line 330
    iput-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->root:Lezvcard/VCard;

    .line 333
    :cond_2
    iget-object v1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    if-eqz v1, :cond_0

    .line 334
    iget-object v1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    invoke-virtual {v1, v0}, Lezvcard/io/EmbeddedVCardException;->injectVCard(Lezvcard/VCard;)V

    .line 335
    const/4 v1, 0x0

    iput-object v1, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    goto :goto_0
.end method

.method public endComponent(Ljava/lang/String;)V
    .locals 8
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 441
    iget-object v6, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v6}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 471
    :cond_0
    return-void

    .line 446
    :cond_1
    const-string v6, "VCARD"

    invoke-virtual {v6, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 451
    iget-object v6, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v6}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/VCard;

    .line 454
    .local v1, "curVCard":Lezvcard/VCard;
    iget-object v6, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->labels:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lezvcard/property/Label;

    .line 455
    .local v4, "label":Lezvcard/property/Label;
    const/4 v5, 0x1

    .line 456
    .local v5, "orphaned":Z
    invoke-virtual {v1}, Lezvcard/VCard;->getAddresses()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/property/Address;

    .line 457
    .local v0, "adr":Lezvcard/property/Address;
    invoke-virtual {v0}, Lezvcard/property/Address;->getLabel()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-virtual {v0}, Lezvcard/property/Address;->getTypes()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v4}, Lezvcard/property/Label;->getTypes()Ljava/util/Set;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 458
    invoke-virtual {v4}, Lezvcard/property/Label;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v6}, Lezvcard/property/Address;->setLabel(Ljava/lang/String;)V

    .line 459
    const/4 v5, 0x0

    .line 463
    .end local v0    # "adr":Lezvcard/property/Address;
    :cond_4
    if-eqz v5, :cond_2

    .line 464
    invoke-virtual {v1, v4}, Lezvcard/VCard;->addOrphanedLabel(Lezvcard/property/Label;)V

    goto :goto_0

    .line 468
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "label":Lezvcard/property/Label;
    .end local v5    # "orphaned":Z
    :cond_5
    iget-object v6, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v6}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 469
    new-instance v6, Lezvcard/io/text/VCardRawReader$StopReadingException;

    invoke-direct {v6}, Lezvcard/io/text/VCardRawReader$StopReadingException;-><init>()V

    throw v6
.end method

.method public invalidLine(Ljava/lang/String;)V
    .locals 3
    .param p1, "line"    # Ljava/lang/String;

    .prologue
    .line 474
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    :goto_0
    return-void

    .line 479
    :cond_0
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Skipping malformed line: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lezvcard/io/text/VCardReader;->access$700(Lezvcard/io/text/VCardReader;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public invalidVersion(Ljava/lang/String;)V
    .locals 3
    .param p1, "version"    # Ljava/lang/String;

    .prologue
    .line 483
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    :goto_0
    return-void

    .line 488
    :cond_0
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring invalid version value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "VERSION"

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public readProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V
    .locals 19
    .param p1, "group"    # Ljava/lang/String;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p4, "value"    # Ljava/lang/String;

    .prologue
    .line 349
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v15}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_0

    .line 438
    :goto_0
    return-void

    .line 354
    :cond_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    if-eqz v15, :cond_1

    .line 356
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    const/16 v16, 0x0

    invoke-virtual/range {v15 .. v16}, Lezvcard/io/EmbeddedVCardException;->injectVCard(Lezvcard/VCard;)V

    .line 357
    const/4 v15, 0x0

    move-object/from16 v0, p0

    iput-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    .line 360
    :cond_1
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v15}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lezvcard/VCard;

    .line 361
    .local v4, "curVCard":Lezvcard/VCard;
    invoke-virtual {v4}, Lezvcard/VCard;->getVersion()Lezvcard/VCardVersion;

    move-result-object v12

    .line 364
    .local v12, "version":Lezvcard/VCardVersion;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    move-object/from16 v0, p3

    # invokes: Lezvcard/io/text/VCardReader;->handleNamelessParameters(Lezvcard/parameter/VCardParameters;)V
    invoke-static {v15, v0}, Lezvcard/io/text/VCardReader;->access$200(Lezvcard/io/text/VCardReader;Lezvcard/parameter/VCardParameters;)V

    .line 365
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    move-object/from16 v0, p3

    # invokes: Lezvcard/io/text/VCardReader;->handleQuotedMultivaluedTypeParams(Lezvcard/parameter/VCardParameters;)V
    invoke-static {v15, v0}, Lezvcard/io/text/VCardReader;->access$300(Lezvcard/io/text/VCardReader;Lezvcard/parameter/VCardParameters;)V

    .line 368
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    # invokes: Lezvcard/io/text/VCardReader;->decodeQuotedPrintable(Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;
    invoke-static {v15, v0, v1, v2}, Lezvcard/io/text/VCardReader;->access$400(Lezvcard/io/text/VCardReader;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 371
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    # getter for: Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;
    invoke-static {v15}, Lezvcard/io/text/VCardReader;->access$500(Lezvcard/io/text/VCardReader;)Lezvcard/io/scribe/ScribeIndex;

    move-result-object v15

    move-object/from16 v0, p2

    invoke-virtual {v15, v0}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v11

    .line 372
    .local v11, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-nez v11, :cond_2

    .line 373
    new-instance v11, Lezvcard/io/scribe/RawPropertyScribe;

    .end local v11    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, p2

    invoke-direct {v11, v0}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    .line 377
    .restart local v11    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_2
    invoke-virtual/range {p3 .. p3}, Lezvcard/parameter/VCardParameters;->getValue()Lezvcard/VCardDataType;

    move-result-object v5

    .line 378
    .local v5, "dataType":Lezvcard/VCardDataType;
    if-nez v5, :cond_3

    .line 380
    invoke-virtual {v11, v12}, Lezvcard/io/scribe/VCardPropertyScribe;->defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v5

    .line 388
    :goto_1
    :try_start_0
    move-object/from16 v0, p4

    move-object/from16 v1, p3

    invoke-virtual {v11, v0, v5, v12, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v10

    .line 390
    .local v10, "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v10}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getWarnings()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .local v7, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 391
    .local v14, "warning":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v15, v14, v0}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_2

    .line 402
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v10    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v14    # "warning":Ljava/lang/String;
    :catch_0
    move-exception v6

    .line 403
    .local v6, "e":Lezvcard/io/SkipMeException;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "Property has requested that it be skipped: "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual {v6}, Lezvcard/io/SkipMeException;->getMessage()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v15, v0, v1}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 383
    .end local v6    # "e":Lezvcard/io/SkipMeException;
    :cond_3
    const/4 v15, 0x0

    move-object/from16 v0, p3

    invoke-virtual {v0, v15}, Lezvcard/parameter/VCardParameters;->setValue(Lezvcard/VCardDataType;)V

    goto :goto_1

    .line 394
    .restart local v7    # "i$":Ljava/util/Iterator;
    .restart local v10    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :cond_4
    :try_start_1
    invoke-virtual {v10}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v9

    .line 395
    .local v9, "property":Lezvcard/property/VCardProperty;
    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    .line 397
    instance-of v15, v9, Lezvcard/property/Label;

    if-eqz v15, :cond_5

    .line 399
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->labels:Ljava/util/List;

    check-cast v9, Lezvcard/property/Label;

    .end local v9    # "property":Lezvcard/property/VCardProperty;
    invoke-interface {v15, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lezvcard/io/SkipMeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_0

    .line 405
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v10    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_1
    move-exception v6

    .line 406
    .local v6, "e":Lezvcard/io/CannotParseException;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "Property value could not be parsed.  Property will be saved as an extended property instead."

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    sget-object v17, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, "  Value: "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    sget-object v17, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    const-string v17, "  Reason: "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual {v6}, Lezvcard/io/CannotParseException;->getMessage()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v15, v0, v1}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    new-instance v9, Lezvcard/property/RawProperty;

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-direct {v9, v0, v1}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .restart local v9    # "property":Lezvcard/property/VCardProperty;
    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    .line 437
    .end local v6    # "e":Lezvcard/io/CannotParseException;
    :cond_5
    :goto_3
    invoke-virtual {v4, v9}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto/16 :goto_0

    .line 409
    .end local v9    # "property":Lezvcard/property/VCardProperty;
    :catch_2
    move-exception v6

    .line 411
    .local v6, "e":Lezvcard/io/EmbeddedVCardException;
    invoke-virtual {v6}, Lezvcard/io/EmbeddedVCardException;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v9

    .line 413
    .restart local v9    # "property":Lezvcard/property/VCardProperty;
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v15

    if-eqz v15, :cond_6

    sget-object v15, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne v12, v15, :cond_7

    .line 415
    :cond_6
    move-object/from16 v0, p0

    iput-object v6, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->embeddedVCardException:Lezvcard/io/EmbeddedVCardException;

    goto :goto_3

    .line 418
    :cond_7
    invoke-static/range {p4 .. p4}, Lezvcard/io/scribe/VCardPropertyScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 420
    new-instance v3, Lezvcard/io/text/VCardReader;

    move-object/from16 v0, p4

    invoke-direct {v3, v0}, Lezvcard/io/text/VCardReader;-><init>(Ljava/lang/String;)V

    .line 422
    .local v3, "agentReader":Lezvcard/io/text/VCardReader;
    :try_start_2
    invoke-virtual {v3}, Lezvcard/io/text/VCardReader;->readNext()Lezvcard/VCard;

    move-result-object v8

    .line 423
    .local v8, "nestedVCard":Lezvcard/VCard;
    if-eqz v8, :cond_8

    .line 424
    invoke-virtual {v6, v8}, Lezvcard/io/EmbeddedVCardException;->injectVCard(Lezvcard/VCard;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 429
    :cond_8
    invoke-virtual {v3}, Lezvcard/io/text/VCardReader;->getWarnings()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .restart local v7    # "i$":Ljava/util/Iterator;
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 430
    .local v13, "w":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "Problem unmarshalling nested vCard value: "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v15, v0, v1}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 432
    .end local v13    # "w":Ljava/lang/String;
    :cond_9
    invoke-static {v3}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_3

    .line 426
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v8    # "nestedVCard":Lezvcard/VCard;
    :catch_3
    move-exception v15

    .line 429
    invoke-virtual {v3}, Lezvcard/io/text/VCardReader;->getWarnings()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .restart local v7    # "i$":Ljava/util/Iterator;
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 430
    .restart local v13    # "w":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "Problem unmarshalling nested vCard value: "

    invoke-virtual/range {v16 .. v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v15, v0, v1}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 432
    .end local v13    # "w":Ljava/lang/String;
    :cond_a
    invoke-static {v3}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto/16 :goto_3

    .line 429
    .end local v7    # "i$":Ljava/util/Iterator;
    :catchall_0
    move-exception v15

    invoke-virtual {v3}, Lezvcard/io/text/VCardReader;->getWarnings()Ljava/util/List;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .restart local v7    # "i$":Ljava/util/Iterator;
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 430
    .restart local v13    # "w":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->this$0:Lezvcard/io/text/VCardReader;

    move-object/from16 v16, v0

    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V

    const-string v18, "Problem unmarshalling nested vCard value: "

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    move-object/from16 v2, p2

    # invokes: Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lezvcard/io/text/VCardReader;->access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    .line 432
    .end local v13    # "w":Ljava/lang/String;
    :cond_b
    invoke-static {v3}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v15
.end method

.method public readVersion(Lezvcard/VCardVersion;)V
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    :goto_0
    return-void

    .line 345
    :cond_0
    iget-object v0, p0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->vcardStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/VCard;

    invoke-virtual {v0, p1}, Lezvcard/VCard;->setVersion(Lezvcard/VCardVersion;)V

    goto :goto_0
.end method
