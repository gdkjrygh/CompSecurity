.class Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;
.super Ljava/lang/Object;
.source "JCardReader.java"

# interfaces
.implements Lezvcard/io/json/JCardRawReader$JCardDataStreamListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/json/JCardReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "JCardDataStreamListenerImpl"
.end annotation


# instance fields
.field final synthetic this$0:Lezvcard/io/json/JCardReader;

.field private vcard:Lezvcard/VCard;

.field private versionFound:Z


# direct methods
.method private constructor <init>(Lezvcard/io/json/JCardReader;)V
    .locals 1

    .prologue
    .line 199
    iput-object p1, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;

    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->versionFound:Z

    return-void
.end method

.method synthetic constructor <init>(Lezvcard/io/json/JCardReader;Lezvcard/io/json/JCardReader$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/io/json/JCardReader;
    .param p2, "x1"    # Lezvcard/io/json/JCardReader$1;

    .prologue
    .line 199
    invoke-direct {p0, p1}, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;-><init>(Lezvcard/io/json/JCardReader;)V

    return-void
.end method

.method static synthetic access$100(Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;)Lezvcard/VCard;
    .locals 1
    .param p0, "x0"    # Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;

    .prologue
    .line 199
    iget-object v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;

    return-object v0
.end method

.method static synthetic access$200(Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;)Z
    .locals 1
    .param p0, "x0"    # Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;

    .prologue
    .line 199
    iget-boolean v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->versionFound:Z

    return v0
.end method


# virtual methods
.method public beginVCard()V
    .locals 2

    .prologue
    .line 204
    new-instance v0, Lezvcard/VCard;

    invoke-direct {v0}, Lezvcard/VCard;-><init>()V

    iput-object v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;

    .line 205
    iget-object v0, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;

    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {v0, v1}, Lezvcard/VCard;->setVersion(Lezvcard/VCardVersion;)V

    .line 206
    return-void
.end method

.method public readProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V
    .locals 14
    .param p1, "group"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p4, "dataType"    # Lezvcard/VCardDataType;
    .param p5, "value"    # Lezvcard/io/json/JCardValue;

    .prologue
    .line 209
    const-string v11, "version"

    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 211
    const/4 v11, 0x1

    iput-boolean v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->versionFound:Z

    .line 213
    invoke-virtual/range {p5 .. p5}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lezvcard/VCardVersion;->valueOfByStr(Ljava/lang/String;)Lezvcard/VCardVersion;

    move-result-object v9

    .line 214
    .local v9, "version":Lezvcard/VCardVersion;
    sget-object v11, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-eq v9, v11, :cond_0

    .line 215
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Version must be \""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    sget-object v13, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {v13}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "\""

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v11, v12, v0}, Lezvcard/io/json/JCardReader;->access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .end local v9    # "version":Lezvcard/VCardVersion;
    :cond_0
    :goto_0
    return-void

    .line 220
    :cond_1
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    # getter for: Lezvcard/io/json/JCardReader;->index:Lezvcard/io/scribe/ScribeIndex;
    invoke-static {v11}, Lezvcard/io/json/JCardReader;->access$400(Lezvcard/io/json/JCardReader;)Lezvcard/io/scribe/ScribeIndex;

    move-result-object v11

    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v7

    .line 221
    .local v7, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-nez v7, :cond_2

    .line 222
    new-instance v7, Lezvcard/io/scribe/RawPropertyScribe;

    .end local v7    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, p2

    invoke-direct {v7, v0}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    .line 227
    .restart local v7    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_2
    :try_start_0
    move-object/from16 v0, p5

    move-object/from16 v1, p4

    move-object/from16 v2, p3

    invoke-virtual {v7, v0, v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v6

    .line 229
    .local v6, "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getWarnings()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 230
    .local v10, "warning":Ljava/lang/String;
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v11, v10, v0}, Lezvcard/io/json/JCardReader;->access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 235
    .end local v4    # "i$":Ljava/util/Iterator;
    .end local v6    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v10    # "warning":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 236
    .local v3, "e":Lezvcard/io/SkipMeException;
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Property has requested that it be skipped: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v3}, Lezvcard/io/SkipMeException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v11, v12, v0}, Lezvcard/io/json/JCardReader;->access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 233
    .end local v3    # "e":Lezvcard/io/SkipMeException;
    .restart local v4    # "i$":Ljava/util/Iterator;
    .restart local v6    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :cond_3
    :try_start_1
    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v5

    .line 234
    .local v5, "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v5, p1}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V
    :try_end_1
    .catch Lezvcard/io/SkipMeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_1 .. :try_end_1} :catch_2

    .line 252
    .end local v4    # "i$":Ljava/util/Iterator;
    :goto_2
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->vcard:Lezvcard/VCard;

    invoke-virtual {v11, v5}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto :goto_0

    .line 238
    .end local v5    # "property":Lezvcard/property/VCardProperty;
    .end local v6    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_1
    move-exception v3

    .line 239
    .local v3, "e":Lezvcard/io/CannotParseException;
    new-instance v7, Lezvcard/io/scribe/RawPropertyScribe;

    .end local v7    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, p2

    invoke-direct {v7, v0}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    .line 240
    .restart local v7    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    move-object/from16 v0, p5

    move-object/from16 v1, p4

    move-object/from16 v2, p3

    invoke-virtual {v7, v0, v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v6

    .line 242
    .restart local v6    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v6}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v5

    .line 243
    .restart local v5    # "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v5, p1}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    move-object v11, v5

    .line 245
    check-cast v11, Lezvcard/property/RawProperty;

    invoke-virtual {v11}, Lezvcard/property/RawProperty;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 246
    .local v8, "valueStr":Ljava/lang/String;
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Property value could not be parsed.  Property will be saved as an extended property instead."

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    sget-object v13, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "  Value: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    sget-object v13, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "  Reason: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v3}, Lezvcard/io/CannotParseException;->getMessage()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v11, v12, v0}, Lezvcard/io/json/JCardReader;->access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 247
    .end local v3    # "e":Lezvcard/io/CannotParseException;
    .end local v5    # "property":Lezvcard/property/VCardProperty;
    .end local v6    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v8    # "valueStr":Ljava/lang/String;
    :catch_2
    move-exception v3

    .line 248
    .local v3, "e":Lezvcard/io/EmbeddedVCardException;
    iget-object v11, p0, Lezvcard/io/json/JCardReader$JCardDataStreamListenerImpl;->this$0:Lezvcard/io/json/JCardReader;

    const-string v12, "Property will not be unmarshalled because jCard does not supported embedded vCards."

    move-object/from16 v0, p2

    # invokes: Lezvcard/io/json/JCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v11, v12, v0}, Lezvcard/io/json/JCardReader;->access$300(Lezvcard/io/json/JCardReader;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method
