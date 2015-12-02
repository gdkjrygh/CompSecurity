.class public Lcom/facebook/selfupdate/o;
.super Ljava/lang/Object;
.source "SelfUpdateLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/facebook/selfupdate/o;->a:Lcom/facebook/analytics/av;

    .line 72
    iput-object p2, p0, Lcom/facebook/selfupdate/o;->b:Lcom/facebook/common/e/h;

    .line 73
    return-void
.end method

.method private a()Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 145
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "self_update"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 146
    const-string v1, "self_update"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 147
    return-object v0
.end method

.method private b(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 132
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/facebook/selfupdate/p;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 135
    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    :cond_0
    invoke-direct {p0}, Lcom/facebook/selfupdate/o;->a()Lcom/facebook/analytics/cb;

    move-result-object v1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 139
    iget-object v0, p0, Lcom/facebook/selfupdate/o;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 142
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/selfupdate/o;->b(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/selfupdate/o;->b(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 92
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 99
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/facebook/selfupdate/o;->b:Lcom/facebook/common/e/h;

    const-string v1, "SelfUpdateService"

    invoke-interface {v0, v1, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 122
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    if-nez p2, :cond_1

    .line 124
    iget-object v0, p0, Lcom/facebook/selfupdate/o;->b:Lcom/facebook/common/e/h;

    const-string v1, "SelfUpdateService"

    invoke-interface {v0, v1, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/facebook/selfupdate/o;->b:Lcom/facebook/common/e/h;

    const-string v1, "SelfUpdateService"

    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 111
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/facebook/selfupdate/o;->b:Lcom/facebook/common/e/h;

    const-string v1, "SelfUpdateService"

    invoke-interface {v0, v1, p1}, Lcom/facebook/common/e/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    :cond_0
    return-void
.end method
