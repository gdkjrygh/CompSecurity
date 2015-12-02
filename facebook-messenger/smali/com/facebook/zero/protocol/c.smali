.class public Lcom/facebook/zero/protocol/c;
.super Ljava/lang/Object;
.source "ZeroTokenHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/http/protocol/aq;

.field private final b:Lcom/facebook/zero/b/d;

.field private final c:Lcom/facebook/zero/ui/h;

.field private final d:Lcom/facebook/zero/ui/p;

.field private final e:Lcom/facebook/zero/rewrite/e;

.field private final f:Lcom/facebook/zero/protocol/a/b;

.field private final g:Lcom/facebook/zero/protocol/a/a;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/aq;Lcom/facebook/zero/b/d;Lcom/facebook/zero/ui/h;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Lcom/facebook/zero/protocol/a/b;Lcom/facebook/zero/protocol/a/a;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/zero/protocol/c;->a:Lcom/facebook/http/protocol/aq;

    .line 46
    iput-object p2, p0, Lcom/facebook/zero/protocol/c;->b:Lcom/facebook/zero/b/d;

    .line 47
    iput-object p3, p0, Lcom/facebook/zero/protocol/c;->c:Lcom/facebook/zero/ui/h;

    .line 48
    iput-object p4, p0, Lcom/facebook/zero/protocol/c;->d:Lcom/facebook/zero/ui/p;

    .line 49
    iput-object p5, p0, Lcom/facebook/zero/protocol/c;->e:Lcom/facebook/zero/rewrite/e;

    .line 50
    iput-object p6, p0, Lcom/facebook/zero/protocol/c;->f:Lcom/facebook/zero/protocol/a/b;

    .line 51
    iput-object p7, p0, Lcom/facebook/zero/protocol/c;->g:Lcom/facebook/zero/protocol/a/a;

    .line 52
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 68
    new-instance v1, Lcom/facebook/http/protocol/l;

    invoke-direct {v1}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 69
    sget-object v0, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/m;)V

    .line 71
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "fetchZeroTokenParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/server/FetchZeroTokenParams;

    .line 73
    iget-object v2, p0, Lcom/facebook/zero/protocol/c;->a:Lcom/facebook/http/protocol/aq;

    iget-object v3, p0, Lcom/facebook/zero/protocol/c;->f:Lcom/facebook/zero/protocol/a/b;

    invoke-interface {v2, v3, v0, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/server/FetchZeroTokenResult;

    .line 78
    iget-object v1, p0, Lcom/facebook/zero/protocol/c;->b:Lcom/facebook/zero/b/d;

    sget-object v2, Lcom/facebook/zero/a/a;->b:Lcom/facebook/zero/b/b;

    iget-object v3, p0, Lcom/facebook/zero/protocol/c;->d:Lcom/facebook/zero/ui/p;

    invoke-virtual {v0}, Lcom/facebook/zero/server/FetchZeroTokenResult;->d()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/zero/ui/p;->a(Lcom/google/common/a/es;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/zero/b/d;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 83
    iget-object v1, p0, Lcom/facebook/zero/protocol/c;->b:Lcom/facebook/zero/b/d;

    sget-object v2, Lcom/facebook/zero/a/a;->c:Lcom/facebook/zero/b/b;

    iget-object v3, p0, Lcom/facebook/zero/protocol/c;->e:Lcom/facebook/zero/rewrite/e;

    invoke-virtual {v0}, Lcom/facebook/zero/server/FetchZeroTokenResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/zero/rewrite/e;->a(Lcom/google/common/a/es;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/zero/b/d;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 88
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 94
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 96
    iget-object v1, p0, Lcom/facebook/zero/protocol/c;->a:Lcom/facebook/http/protocol/aq;

    iget-object v2, p0, Lcom/facebook/zero/protocol/c;->g:Lcom/facebook/zero/protocol/a/a;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/CarrierBottomBannerData;

    .line 98
    iget-object v1, p0, Lcom/facebook/zero/protocol/c;->b:Lcom/facebook/zero/b/d;

    sget-object v2, Lcom/facebook/zero/a/a;->a:Lcom/facebook/zero/b/b;

    iget-object v3, p0, Lcom/facebook/zero/protocol/c;->c:Lcom/facebook/zero/ui/h;

    invoke-virtual {v3, v0}, Lcom/facebook/zero/ui/h;->a(Lcom/facebook/zero/ui/CarrierBottomBannerData;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/zero/b/d;->b(Lcom/facebook/common/s/a;Ljava/lang/String;)V

    .line 102
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 56
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 57
    sget-object v1, Lcom/facebook/zero/server/e;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/zero/protocol/c;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 60
    :goto_0
    return-object v0

    .line 59
    :cond_0
    sget-object v1, Lcom/facebook/zero/server/e;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 60
    invoke-direct {p0, p1}, Lcom/facebook/zero/protocol/c;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 62
    :cond_1
    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1
.end method
