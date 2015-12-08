.class final Lcom/mopub/mobileads/util/vast/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/w3c/dom/Document;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 157
    return-void
.end method

.method private static a(Ljava/util/List;Ljava/util/List;F)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastFractionalProgressTracker;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;F)V"
        }
    .end annotation

    .prologue
    .line 414
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 415
    new-instance v2, Lcom/mopub/mobileads/VastFractionalProgressTracker;

    invoke-direct {v2, v0, p2}, Lcom/mopub/mobileads/VastFractionalProgressTracker;-><init>(Ljava/lang/String;F)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 417
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 410
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "Tracking"

    const-string v2, "event"

    invoke-static {v0, v1, v2, p1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 209
    iget-object v1, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v2, "VASTAdTagURI"

    .line 1231
    invoke-static {v1, v2, v0, v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 210
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 196
    const-string v0, "<\\?.*\\?>"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 200
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<MPMoVideoXMLDocRoot>"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "</MPMoVideoXMLDocRoot>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 202
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v1

    .line 203
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->setCoalescing(Z)V

    .line 204
    invoke-virtual {v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v1

    .line 205
    new-instance v2, Lorg/xml/sax/InputSource;

    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v1, v2}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    .line 206
    return-void
.end method

.method final b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 214
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "Impression"

    .line 2231
    invoke-static {v0, v1, v3, v3}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 215
    iget-object v1, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v2, "MP_TRACKING_URL"

    .line 3231
    invoke-static {v1, v2, v3, v3}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 215
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 217
    return-object v0
.end method

.method final c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastFractionalProgressTracker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 241
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 242
    const-string v0, "firstQuartile"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/high16 v2, 0x3e800000    # 0.25f

    invoke-static {v1, v0, v2}, Lcom/mopub/mobileads/util/vast/b;->a(Ljava/util/List;Ljava/util/List;F)V

    .line 243
    const-string v0, "midpoint"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v1, v0, v2}, Lcom/mopub/mobileads/util/vast/b;->a(Ljava/util/List;Ljava/util/List;F)V

    .line 244
    const-string v0, "thirdQuartile"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-static {v1, v0, v2}, Lcom/mopub/mobileads/util/vast/b;->a(Ljava/util/List;Ljava/util/List;F)V

    .line 247
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v2, "Tracking"

    const-string v3, "event"

    const-string v4, "progress"

    invoke-static {v0, v2, v3, v4}, Lcom/mopub/mobileads/util/vast/XmlUtils;->b(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 248
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;

    .line 249
    const-string v3, "offset"

    invoke-static {v0, v3}, Lcom/mopub/mobileads/util/vast/XmlUtils;->c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 250
    invoke-static {v3}, Lcom/mopub/common/util/Strings;->isPercentageTracker(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 251
    invoke-static {v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 253
    :try_start_0
    const-string v4, "%"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    .line 254
    new-instance v5, Lcom/mopub/mobileads/VastFractionalProgressTracker;

    invoke-direct {v5, v0, v4}, Lcom/mopub/mobileads/VastFractionalProgressTracker;-><init>(Ljava/lang/String;F)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 256
    :catch_0
    move-exception v0

    const-string v0, "Failed to parse VAST progress tracker %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 262
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 263
    return-object v1
.end method

.method final d()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/VastAbsoluteProgressTracker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 285
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 287
    const-string v0, "start"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 288
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 289
    new-instance v3, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;

    const/16 v4, 0x7d0

    invoke-direct {v3, v0, v4}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 293
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v2, "Tracking"

    const-string v3, "event"

    const-string v4, "progress"

    invoke-static {v0, v2, v3, v4}, Lcom/mopub/mobileads/util/vast/XmlUtils;->b(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 294
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;

    .line 295
    const-string v3, "offset"

    invoke-static {v0, v3}, Lcom/mopub/mobileads/util/vast/XmlUtils;->c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 296
    invoke-static {v3}, Lcom/mopub/common/util/Strings;->isAbsoluteTracker(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 297
    invoke-static {v0}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 299
    :try_start_0
    invoke-static {v3}, Lcom/mopub/common/util/Strings;->parseAbsoluteOffset(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    .line 300
    if-eqz v4, :cond_1

    .line 301
    new-instance v5, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v5, v0, v4}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 304
    :catch_0
    move-exception v0

    const-string v0, "Failed to parse VAST progress tracker %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 310
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 311
    return-object v1
.end method

.method final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 315
    const-string v0, "complete"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 319
    const-string v0, "close"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 323
    const-string v0, "skip"

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/util/vast/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method final h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 327
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "ClickThrough"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final i()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 331
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "ClickTracking"

    .line 4231
    invoke-static {v0, v1, v2, v2}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 331
    return-object v0
.end method

.method final j()Ljava/lang/String;
    .locals 3

    .prologue
    .line 340
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "MoPubCtaText"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 341
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xf

    if-gt v1, v2, :cond_0

    .line 345
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final k()Ljava/lang/String;
    .locals 3

    .prologue
    .line 350
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "MoPubSkipText"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 351
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-gt v1, v2, :cond_0

    .line 355
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final l()Ljava/lang/String;
    .locals 2

    .prologue
    .line 360
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "MoPubCloseIcon"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final m()Lcom/mopub/common/util/DeviceUtils$ForceOrientation;
    .locals 2

    .prologue
    .line 365
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "MoPubForceOrientation"

    invoke-static {v0, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/util/DeviceUtils$ForceOrientation;->getForceOrientation(Ljava/lang/String;)Lcom/mopub/common/util/DeviceUtils$ForceOrientation;

    move-result-object v0

    return-object v0
.end method

.method final n()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 371
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v2, "Linear"

    const-string v3, "skipoffset"

    invoke-static {v0, v2, v3, v1}, Lcom/mopub/mobileads/util/vast/XmlUtils;->b(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 372
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 373
    :goto_0
    if-nez v0, :cond_1

    move-object v0, v1

    .line 386
    :goto_1
    return-object v0

    .line 372
    :cond_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Node;

    goto :goto_0

    .line 377
    :cond_1
    const-string v2, "skipoffset"

    invoke-static {v0, v2}, Lcom/mopub/mobileads/util/vast/XmlUtils;->c(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 378
    if-nez v0, :cond_2

    move-object v0, v1

    .line 379
    goto :goto_1

    .line 382
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 383
    goto :goto_1

    .line 386
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method final o()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 390
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "MediaFile"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v1

    .line 391
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 393
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 394
    new-instance v3, Lcom/mopub/mobileads/util/vast/d;

    invoke-interface {v1, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lcom/mopub/mobileads/util/vast/d;-><init>(Lcom/mopub/mobileads/util/vast/b;Lorg/w3c/dom/Node;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 393
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 396
    :cond_0
    return-object v2
.end method

.method final p()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/mobileads/util/vast/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 400
    iget-object v0, p0, Lcom/mopub/mobileads/util/vast/b;->a:Lorg/w3c/dom/Document;

    const-string v1, "Companion"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v1

    .line 401
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 404
    new-instance v3, Lcom/mopub/mobileads/util/vast/c;

    invoke-interface {v1, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Lcom/mopub/mobileads/util/vast/c;-><init>(Lcom/mopub/mobileads/util/vast/b;Lorg/w3c/dom/Node;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 403
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 406
    :cond_0
    return-object v2
.end method
