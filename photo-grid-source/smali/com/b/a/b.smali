.class public final Lcom/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/b/a/a/a;

.field private b:Lcom/b/a/b/e;

.field private c:Lcom/b/a/c/h;

.field private d:Lcom/b/a/c/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/a;
    .locals 4

    .prologue
    .line 131
    iget-object v0, p0, Lcom/b/a/b;->d:Lcom/b/a/c/s;

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    if-eqz v0, :cond_0

    .line 133
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/b/a/b;->d:Lcom/b/a/c/s;

    invoke-virtual {v0}, Lcom/b/a/c/s;->a()Lcom/b/a/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/b/a/b;->a:Lcom/b/a/a/a;

    if-nez v0, :cond_2

    .line 141
    new-instance v0, Lcom/b/a/a/a;

    invoke-direct {v0}, Lcom/b/a/a/a;-><init>()V

    iput-object v0, p0, Lcom/b/a/b;->a:Lcom/b/a/a/a;

    .line 144
    :cond_2
    iget-object v0, p0, Lcom/b/a/b;->b:Lcom/b/a/b/e;

    if-nez v0, :cond_3

    .line 145
    new-instance v0, Lcom/b/a/b/e;

    invoke-direct {v0}, Lcom/b/a/b/e;-><init>()V

    iput-object v0, p0, Lcom/b/a/b;->b:Lcom/b/a/b/e;

    .line 148
    :cond_3
    iget-object v0, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    if-nez v0, :cond_4

    .line 149
    new-instance v0, Lcom/b/a/c/h;

    invoke-direct {v0}, Lcom/b/a/c/h;-><init>()V

    iput-object v0, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    .line 152
    :cond_4
    new-instance v0, Lcom/b/a/a;

    iget-object v1, p0, Lcom/b/a/b;->a:Lcom/b/a/a/a;

    iget-object v2, p0, Lcom/b/a/b;->b:Lcom/b/a/b/e;

    iget-object v3, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    invoke-direct {v0, v1, v2, v3}, Lcom/b/a/a;-><init>(Lcom/b/a/a/a;Lcom/b/a/b/e;Lcom/b/a/c/h;)V

    return-object v0
.end method

.method public final a(Lcom/b/a/c/h;)Lcom/b/a/b;
    .locals 2

    .prologue
    .line 118
    if-nez p1, :cond_0

    .line 119
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "CrashlyticsCore Kit must not be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    if-eqz v0, :cond_1

    .line 123
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CrashlyticsCore Kit already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 126
    :cond_1
    iput-object p1, p0, Lcom/b/a/b;->c:Lcom/b/a/c/h;

    .line 127
    return-object p0
.end method
