.class public Lcom/facebook/http/protocol/ar;
.super Lcom/facebook/http/protocol/b;
.source "SingleMethodRunnerImpl.java"


# static fields
.field private static final a:Ljava/lang/Class;


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/http/c/i;

.field private final d:Lcom/facebook/http/c/i;

.field private final e:Lcom/facebook/http/b/ap;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/facebook/config/a/c;

.field private final l:Lcom/fasterxml/jackson/core/JsonFactory;

.field private final m:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final n:Lcom/facebook/http/protocol/s;

.field private final o:Lcom/facebook/http/protocol/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-class v0, Lcom/facebook/http/protocol/ar;

    sput-object v0, Lcom/facebook/http/protocol/ar;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/http/c/i;Lcom/facebook/http/c/i;Lcom/facebook/http/b/ap;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/config/a/c;Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/http/protocol/s;Lcom/facebook/http/protocol/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;",
            "Lcom/facebook/http/c/i;",
            "Lcom/facebook/http/c/i;",
            "Lcom/facebook/http/b/ap;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/config/a/c;",
            "Lcom/fasterxml/jackson/core/JsonFactory;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/http/protocol/s;",
            "Lcom/facebook/http/protocol/q;",
            ")V"
        }
    .end annotation

    .prologue
    .line 104
    invoke-direct {p0}, Lcom/facebook/http/protocol/b;-><init>()V

    .line 105
    iput-object p1, p0, Lcom/facebook/http/protocol/ar;->b:Ljavax/inject/a;

    .line 106
    iput-object p2, p0, Lcom/facebook/http/protocol/ar;->c:Lcom/facebook/http/c/i;

    .line 107
    iput-object p3, p0, Lcom/facebook/http/protocol/ar;->d:Lcom/facebook/http/c/i;

    .line 108
    iput-object p4, p0, Lcom/facebook/http/protocol/ar;->e:Lcom/facebook/http/b/ap;

    .line 109
    iput-object p5, p0, Lcom/facebook/http/protocol/ar;->f:Ljavax/inject/a;

    .line 110
    iput-object p6, p0, Lcom/facebook/http/protocol/ar;->g:Ljavax/inject/a;

    .line 111
    iput-object p7, p0, Lcom/facebook/http/protocol/ar;->h:Ljavax/inject/a;

    .line 112
    iput-object p8, p0, Lcom/facebook/http/protocol/ar;->i:Ljavax/inject/a;

    .line 113
    iput-object p9, p0, Lcom/facebook/http/protocol/ar;->j:Ljavax/inject/a;

    .line 114
    iput-object p10, p0, Lcom/facebook/http/protocol/ar;->k:Lcom/facebook/config/a/c;

    .line 115
    iput-object p11, p0, Lcom/facebook/http/protocol/ar;->l:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 116
    iput-object p12, p0, Lcom/facebook/http/protocol/ar;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 117
    iput-object p13, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    .line 118
    iput-object p14, p0, Lcom/facebook/http/protocol/ar;->o:Lcom/facebook/http/protocol/q;

    .line 119
    return-void
.end method

.method private a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/h;)Lcom/facebook/http/d/a/d;
    .locals 6
    .param p2    # Lcom/facebook/http/protocol/h;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 416
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->e()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 417
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot add attachment to string entities"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 420
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;)Ljava/util/List;

    move-result-object v0

    .line 422
    new-instance v1, Lcom/facebook/http/d/a/d;

    sget-object v2, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/http/d/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    if-eqz p2, :cond_1

    .line 427
    invoke-virtual {v1}, Lcom/facebook/http/d/a/d;->getContentLength()J

    move-result-wide v2

    .line 428
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 431
    new-instance v0, Lcom/facebook/http/protocol/as;

    invoke-direct {v0, p0, p2, v2, v3}, Lcom/facebook/http/protocol/as;-><init>(Lcom/facebook/http/protocol/ar;Lcom/facebook/http/protocol/h;J)V

    invoke-virtual {v1, v0}, Lcom/facebook/http/d/a/d;->a(Lcom/facebook/http/d/a/a;)V

    .line 439
    :cond_1
    return-object v1
.end method

.method private a(Lcom/facebook/http/protocol/n;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/n;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;"
        }
    .end annotation

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->o:Lcom/facebook/http/protocol/q;

    invoke-virtual {v0, p1}, Lcom/facebook/http/protocol/q;->a(Lcom/facebook/http/protocol/n;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    .line 389
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->b(Lcom/facebook/http/protocol/n;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 390
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 391
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v0

    .line 392
    :goto_0
    if-nez v0, :cond_1

    .line 393
    new-instance v0, Lcom/facebook/http/protocol/u;

    const-string v1, "auth token is null, user logged out?"

    invoke-direct {v0, v1}, Lcom/facebook/http/protocol/u;-><init>(Ljava/lang/String;)V

    throw v0

    .line 391
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 395
    :cond_1
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "access_token"

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->c()Ljava/lang/String;

    move-result-object v0

    .line 399
    const-string v2, "method/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 400
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "method"

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 406
    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->c(Lcom/facebook/http/protocol/n;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 407
    invoke-direct {p0, v1}, Lcom/facebook/http/protocol/ar;->a(Ljava/util/List;)V

    .line 410
    :cond_4
    return-object v1

    .line 401
    :cond_5
    const-string v0, "DELETE"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 402
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "method"

    const-string v3, "DELETE"

    invoke-direct {v0, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/apache/http/NameValuePair;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 476
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "api_key"

    iget-object v2, p0, Lcom/facebook/http/protocol/ar;->k:Lcom/facebook/config/a/c;

    invoke-interface {v2}, Lcom/facebook/config/a/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    new-instance v0, Lcom/facebook/http/protocol/au;

    invoke-direct {v0, p0}, Lcom/facebook/http/protocol/au;-><init>(Lcom/facebook/http/protocol/ar;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 486
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 487
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 488
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    const-string v3, "="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->k:Lcom/facebook/config/a/c;

    invoke-interface {v0}, Lcom/facebook/config/a/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 495
    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "sig"

    invoke-direct {v1, v2, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 496
    return-void
.end method

.method private b(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/h;)Lcom/facebook/http/a/a/a/i;
    .locals 6
    .param p2    # Lcom/facebook/http/protocol/h;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 445
    new-instance v1, Lcom/facebook/http/d/a/b;

    invoke-direct {v1}, Lcom/facebook/http/d/a/b;-><init>()V

    .line 447
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;)Ljava/util/List;

    move-result-object v0

    .line 449
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 450
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/facebook/http/a/a/a/a/d;

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v0, v5}, Lcom/facebook/http/a/a/a/a/d;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-virtual {v1, v3, v4}, Lcom/facebook/http/d/a/b;->a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    goto :goto_0

    .line 452
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->e()Ljava/util/List;

    move-result-object v0

    .line 453
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 454
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/a/a/a/a;

    .line 455
    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/http/a/a/a/a;->b()Lcom/facebook/http/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/facebook/http/d/a/b;->a(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    goto :goto_1

    .line 459
    :cond_1
    if-eqz p2, :cond_2

    .line 460
    invoke-virtual {v1}, Lcom/facebook/http/d/a/b;->getContentLength()J

    move-result-wide v2

    .line 461
    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    .line 464
    new-instance v0, Lcom/facebook/http/protocol/at;

    invoke-direct {v0, p0, p2, v2, v3}, Lcom/facebook/http/protocol/at;-><init>(Lcom/facebook/http/protocol/ar;Lcom/facebook/http/protocol/h;J)V

    invoke-virtual {v1, v0}, Lcom/facebook/http/d/a/b;->a(Lcom/facebook/http/d/a/a;)V

    .line 472
    :cond_2
    return-object v1
.end method

.method private b(Lcom/facebook/http/protocol/n;)Z
    .locals 2

    .prologue
    .line 499
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->c()Ljava/lang/String;

    move-result-object v0

    .line 500
    const-string v1, "method/auth.login"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/auth.getSessionForApp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/logging.mobilelogs"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/mobile.sendPhoneConfirmationCode"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.validateRegistrationData"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.confirmPhoneAndRegisterPartialAccount"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/app.loggedoutsettings"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.register"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fetchSessionlessAppInfo"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lookupUser"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Lcom/facebook/http/protocol/n;)Z
    .locals 2

    .prologue
    .line 515
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->c()Ljava/lang/String;

    move-result-object v0

    .line 516
    const-string v1, "method/auth.login"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/logging.mobilelogs"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/mobile.sendPhoneConfirmationCode"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.validateRegistrationData"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.confirmPhoneAndRegisterPartialAccount"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/app.loggedoutsettings"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "method/user.register"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fetchSessionlessAppInfo"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lookupUser"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/l;Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/r;
    .locals 8
    .param p2    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/http/protocol/f;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PARAMS:",
            "Ljava/lang/Object;",
            "RESU",
            "LT:Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/http/protocol/n;",
            "Lcom/facebook/http/protocol/l;",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;)",
            "Lcom/facebook/http/protocol/r;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 199
    sget-object v0, Lcom/facebook/http/protocol/ar;->a:Ljava/lang/Class;

    const-string v1, "API request executing: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    if-nez p2, :cond_0

    .line 202
    new-instance p2, Lcom/facebook/http/protocol/l;

    invoke-direct {p2}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 205
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->c()Ljava/lang/String;

    move-result-object v3

    .line 209
    sget-object v0, Lcom/facebook/http/protocol/av;->a:[I

    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->c()Lcom/facebook/http/protocol/m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/m;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 218
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/i;

    move-object v1, v0

    .line 222
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 223
    invoke-interface {v1}, Lcom/facebook/http/c/i;->c()Landroid/net/Uri$Builder;

    move-result-object v0

    move-object v2, v0

    .line 231
    :goto_1
    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 233
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->c(Lcom/facebook/http/protocol/n;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 234
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    const-string v0, "phprof_sample"

    const-string v3, "1"

    invoke-virtual {v2, v0, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 236
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 237
    if-eqz v0, :cond_1

    .line 238
    const-string v3, "phprof_user"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 242
    const-string v0, "teak_sample"

    const-string v3, "1"

    invoke-virtual {v2, v0, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 243
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 244
    if-eqz v0, :cond_2

    .line 245
    const-string v3, "teak_user"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 248
    :cond_2
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 249
    const-string v0, "wirehog_sample"

    const-string v3, "1"

    invoke-virtual {v2, v0, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 250
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 251
    if-eqz v0, :cond_3

    .line 252
    const-string v3, "wirehog_user"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 258
    :cond_3
    const-string v0, "GET"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 259
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->b(Lcom/facebook/http/protocol/n;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 260
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 261
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v0

    .line 262
    :goto_2
    if-nez v0, :cond_8

    .line 263
    new-instance v0, Lcom/facebook/http/protocol/u;

    const-string v1, "auth token is null, user logged out?"

    invoke-direct {v0, v1}, Lcom/facebook/http/protocol/u;-><init>(Ljava/lang/String;)V

    throw v0

    .line 211
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->c:Lcom/facebook/http/c/i;

    move-object v1, v0

    .line 212
    goto/16 :goto_0

    .line 214
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->d:Lcom/facebook/http/c/i;

    move-object v1, v0

    .line 215
    goto/16 :goto_0

    .line 224
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 225
    invoke-interface {v1}, Lcom/facebook/http/c/i;->d()Landroid/net/Uri$Builder;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    .line 226
    :cond_5
    const-string v0, "method"

    invoke-virtual {v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 227
    invoke-interface {v1}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    .line 229
    :cond_6
    invoke-interface {v1}, Lcom/facebook/http/c/i;->b()Landroid/net/Uri$Builder;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_1

    :cond_7
    move-object v0, v6

    .line 261
    goto :goto_2

    .line 265
    :cond_8
    const-string v3, "access_token"

    invoke-virtual {v2, v3, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 267
    :cond_9
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->o:Lcom/facebook/http/protocol/q;

    invoke-virtual {v0, p1}, Lcom/facebook/http/protocol/q;->a(Lcom/facebook/http/protocol/n;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 269
    invoke-direct {p0, p1}, Lcom/facebook/http/protocol/ar;->c(Lcom/facebook/http/protocol/n;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 270
    invoke-direct {p0, v0}, Lcom/facebook/http/protocol/ar;->a(Ljava/util/List;)V

    .line 272
    :cond_a
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 273
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_3

    .line 275
    :cond_b
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 293
    :goto_4
    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->b()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 294
    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->b()Lorg/apache/http/params/HttpParams;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 297
    :cond_c
    invoke-interface {v1}, Lcom/facebook/http/c/i;->e()Ljava/lang/String;

    move-result-object v2

    .line 298
    if-eqz v2, :cond_d

    .line 299
    const-string v3, "User-Agent"

    invoke-interface {v0, v3, v2}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    :cond_d
    invoke-interface {v1}, Lcom/facebook/http/c/i;->f()Ljava/lang/String;

    move-result-object v1

    .line 303
    if-eqz v1, :cond_e

    .line 304
    const-string v2, "X-FB-Connection-Type"

    invoke-interface {v0, v2, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :cond_e
    if-eqz p3, :cond_1e

    instance-of v1, p3, Lcom/facebook/http/protocol/g;

    if-eqz v1, :cond_1e

    .line 309
    check-cast p3, Lcom/facebook/http/protocol/g;

    .line 310
    invoke-interface {p3, p4}, Lcom/facebook/http/protocol/g;->a(Ljava/lang/Object;)V

    .line 313
    :goto_5
    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->d()Lcom/facebook/http/protocol/ah;

    move-result-object v7

    .line 314
    if-eqz v7, :cond_f

    .line 315
    invoke-virtual {v7, v0}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    .line 318
    :cond_f
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->JSONPARSER:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_16

    .line 319
    iget-object v1, p0, Lcom/facebook/http/protocol/ar;->e:Lcom/facebook/http/b/ap;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 321
    if-eqz p3, :cond_10

    .line 322
    invoke-interface {p3, p4}, Lcom/facebook/http/protocol/g;->b(Ljava/lang/Object;)V

    .line 324
    :cond_10
    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 325
    iget-object v1, p0, Lcom/facebook/http/protocol/ar;->l:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v3

    .line 326
    iget-object v0, p0, Lcom/facebook/http/protocol/ar;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/core/JsonParser;->setCodec(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    .line 327
    new-instance v0, Lcom/facebook/http/protocol/r;

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v4, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Lcom/fasterxml/jackson/core/JsonParser;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 378
    if-eqz v7, :cond_11

    .line 379
    invoke-virtual {v7, v6}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    :cond_11
    :goto_6
    return-object v0

    .line 277
    :cond_12
    const-string v0, "POST"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "DELETE"

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 278
    :cond_13
    new-instance v0, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 279
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->j()Lcom/facebook/http/protocol/o;

    move-result-object v2

    sget-object v3, Lcom/facebook/http/protocol/o;->SINGLE_STRING_ENTITY:Lcom/facebook/http/protocol/o;

    if-ne v2, v3, :cond_14

    .line 280
    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->a()Lcom/facebook/http/protocol/h;

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/h;)Lcom/facebook/http/d/a/d;

    move-result-object v2

    .line 282
    invoke-virtual {v0, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    goto/16 :goto_4

    .line 284
    :cond_14
    invoke-virtual {p2}, Lcom/facebook/http/protocol/l;->a()Lcom/facebook/http/protocol/h;

    move-result-object v2

    invoke-direct {p0, p1, v2}, Lcom/facebook/http/protocol/ar;->b(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/h;)Lcom/facebook/http/a/a/a/i;

    move-result-object v2

    .line 286
    invoke-virtual {v0, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    goto/16 :goto_4

    .line 290
    :cond_15
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported method: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_16
    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_18

    .line 334
    new-instance v1, Lcom/facebook/http/protocol/al;

    iget-object v2, p0, Lcom/facebook/http/protocol/ar;->m:Lcom/fasterxml/jackson/databind/ObjectMapper;

    iget-object v3, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-direct {v1, v2, v3}, Lcom/facebook/http/protocol/al;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/http/protocol/s;)V

    .line 336
    iget-object v2, p0, Lcom/facebook/http/protocol/ar;->e:Lcom/facebook/http/b/ap;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 338
    if-eqz p3, :cond_17

    .line 339
    invoke-interface {p3, p4}, Lcom/facebook/http/protocol/g;->b(Ljava/lang/Object;)V

    .line 341
    :cond_17
    invoke-virtual {v1}, Lcom/facebook/http/protocol/al;->a()Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 342
    new-instance v0, Lcom/facebook/http/protocol/r;

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v4, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 378
    if-eqz v7, :cond_11

    .line 379
    invoke-virtual {v7, v6}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    goto/16 :goto_6

    .line 348
    :cond_18
    :try_start_2
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1a

    .line 349
    new-instance v1, Lcom/facebook/http/protocol/aw;

    iget-object v2, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-direct {v1, v2}, Lcom/facebook/http/protocol/aw;-><init>(Lcom/facebook/http/protocol/s;)V

    .line 350
    iget-object v2, p0, Lcom/facebook/http/protocol/ar;->e:Lcom/facebook/http/b/ap;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 352
    if-eqz p3, :cond_19

    .line 353
    invoke-interface {p3, p4}, Lcom/facebook/http/protocol/g;->b(Ljava/lang/Object;)V

    .line 355
    :cond_19
    invoke-virtual {v1}, Lcom/facebook/http/protocol/aw;->a()Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 356
    new-instance v0, Lcom/facebook/http/protocol/r;

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-interface {v2}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v4, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 378
    if-eqz v7, :cond_11

    .line 379
    invoke-virtual {v7, v6}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    goto/16 :goto_6

    .line 362
    :cond_1a
    :try_start_3
    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->f()Lcom/facebook/http/protocol/t;

    move-result-object v1

    sget-object v2, Lcom/facebook/http/protocol/t;->ENTITY:Lcom/facebook/http/protocol/t;

    if-ne v1, v2, :cond_1c

    .line 363
    iget-object v1, p0, Lcom/facebook/http/protocol/ar;->e:Lcom/facebook/http/b/ap;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 365
    if-eqz p3, :cond_1b

    .line 366
    invoke-interface {p3, p4}, Lcom/facebook/http/protocol/g;->b(Ljava/lang/Object;)V

    .line 368
    :cond_1b
    new-instance v0, Lcom/facebook/http/protocol/r;

    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/http/protocol/ar;->n:Lcom/facebook/http/protocol/s;

    invoke-virtual {p1}, Lcom/facebook/http/protocol/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/r;-><init>(ILjava/util/List;Lorg/apache/http/HttpEntity;Lcom/facebook/http/protocol/s;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 378
    if-eqz v7, :cond_11

    .line 379
    invoke-virtual {v7, v6}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    goto/16 :goto_6

    .line 375
    :cond_1c
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown api response type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 378
    :catchall_0
    move-exception v0

    if-eqz v7, :cond_1d

    .line 379
    invoke-virtual {v7, v6}, Lcom/facebook/http/protocol/ah;->a(Lorg/apache/http/client/methods/HttpUriRequest;)V

    :cond_1d
    throw v0

    :cond_1e
    move-object p3, v6

    goto/16 :goto_5

    .line 209
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/facebook/http/protocol/af;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PARAMS:",
            "Ljava/lang/Object;",
            "RESU",
            "LT:Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/http/protocol/af",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;",
            "Lcom/facebook/http/protocol/l;",
            ")TRESU",
            "LT;"
        }
    .end annotation

    .prologue
    .line 162
    invoke-interface {p1, p2}, Lcom/facebook/http/protocol/af;->b(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    .line 163
    invoke-virtual {p0, v0, p3, p1, p2}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/l;Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/r;

    move-result-object v1

    .line 167
    :try_start_0
    invoke-interface {p1, p2, v1}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/facebook/http/protocol/ae; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/facebook/http/protocol/ag; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 185
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    .line 188
    :goto_0
    invoke-interface {p1, p2, v1}, Lcom/facebook/http/protocol/af;->b(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)V

    .line 190
    return-object v0

    .line 168
    :catch_0
    move-exception v0

    .line 172
    :try_start_1
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    .line 173
    invoke-interface {p1, p2}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    .line 174
    invoke-virtual {p0, v0, p3, p1, p2}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/l;Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/r;

    move-result-object v1

    .line 175
    invoke-interface {p1, p2, v1}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 185
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    goto :goto_0

    .line 176
    :catch_1
    move-exception v0

    .line 179
    const/4 v0, 0x0

    :try_start_2
    invoke-interface {p1, p2, v0}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;Z)V

    .line 180
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    .line 181
    invoke-interface {p1, p2}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    .line 182
    invoke-virtual {p0, v0, p3, p1, p2}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/l;Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/r;

    move-result-object v1

    .line 183
    invoke-interface {p1, p2, v1}, Lcom/facebook/http/protocol/af;->a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 185
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    throw v0
.end method

.method public a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/http/protocol/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PARAMS:",
            "Ljava/lang/Object;",
            "RESU",
            "LT:Ljava/lang/Object;",
            ">(",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;",
            "Lcom/facebook/http/protocol/l;",
            ")TRESU",
            "LT;"
        }
    .end annotation

    .prologue
    .line 128
    instance-of v0, p1, Lcom/facebook/http/protocol/af;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 132
    check-cast v0, Lcom/facebook/http/protocol/af;

    .line 134
    invoke-interface {v0, p2}, Lcom/facebook/http/protocol/af;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 136
    invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/af;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    .line 146
    :goto_0
    return-object v0

    .line 140
    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/http/protocol/f;->a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    .line 141
    invoke-virtual {p0, v0, p3, p1, p2}, Lcom/facebook/http/protocol/ar;->a(Lcom/facebook/http/protocol/n;Lcom/facebook/http/protocol/l;Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/r;

    move-result-object v1

    .line 144
    :try_start_0
    invoke-interface {p1, p2, v1}, Lcom/facebook/http/protocol/f;->a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 146
    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/http/protocol/r;->e()V

    throw v0
.end method
