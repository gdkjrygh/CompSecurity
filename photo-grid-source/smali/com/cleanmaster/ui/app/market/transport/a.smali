.class public Lcom/cleanmaster/ui/app/market/transport/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected mHost:Ljava/lang/String;

.field protected mPort:I

.field protected mQuery:Ljava/lang/String;

.field protected qparams:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/b;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mHost:Ljava/lang/String;

    .line 20
    sget v0, Lcom/cleanmaster/ui/app/market/transport/b;->a:I

    iput v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mPort:I

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mQuery:Ljava/lang/String;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    .line 25
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/transport/a;->v(I)Lcom/cleanmaster/ui/app/market/transport/a;

    .line 26
    return-void
.end method


# virtual methods
.method public android_id()Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 52
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "android_id"

    invoke-static {}, Lcom/cleanmaster/common/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    return-object p0
.end method

.method public brand()Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 5

    .prologue
    .line 76
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "brand"

    const-string v3, "ro.product.brand"

    const-string v4, "unknow"

    invoke-static {v3, v4}, Lcom/cleanmaster/functionevent/report/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    return-object p0
.end method

.method public ch()Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 84
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "ch"

    invoke-static {}, Lcom/cleanmaster/common/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    return-object p0
.end method

.method public country(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 138
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "country"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    return-object p0
.end method

.method public cver(I)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 97
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "cver"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    return-object p0
.end method

.method public k(I)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 130
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "k"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    return-object p0
.end method

.method public lan(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 121
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "lan"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    return-object p0
.end method

.method public mcc(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "mcc"

    invoke-direct {v1, v2, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    return-object p0
.end method

.method public model()Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 5

    .prologue
    .line 60
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "model"

    const-string v3, "ro.product.model"

    const-string v4, "unknow"

    invoke-static {v3, v4}, Lcom/cleanmaster/functionevent/report/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    return-object p0
.end method

.method public net(I)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 113
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "net"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    return-object p0
.end method

.method public os_version()Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 5

    .prologue
    .line 89
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "os_version"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    return-object p0
.end method

.method public resolution(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 105
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "resolution"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    return-object p0
.end method

.method public setHost(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mHost:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public setPort(I)V
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mPort:I

    .line 34
    return-void
.end method

.method public setQuery(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mQuery:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public toURI()Ljava/net/URI;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 145
    :try_start_0
    const-string v0, "http"

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mHost:Ljava/lang/String;

    iget v2, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mPort:I

    iget-object v3, p0, Lcom/cleanmaster/ui/app/market/transport/a;->mQuery:Ljava/lang/String;

    iget-object v4, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    const-string v5, "UTF-8"

    invoke-static {v4, v5}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 150
    :goto_0
    return-object v0

    .line 147
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->printStackTrace()V

    move-object v0, v6

    .line 148
    goto :goto_0
.end method

.method public v(I)Lcom/cleanmaster/ui/app/market/transport/a;
    .locals 4

    .prologue
    .line 44
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/transport/a;->qparams:Ljava/util/List;

    new-instance v1, Lorg/apache/http/message/BasicNameValuePair;

    const-string v2, "v"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    return-object p0
.end method
