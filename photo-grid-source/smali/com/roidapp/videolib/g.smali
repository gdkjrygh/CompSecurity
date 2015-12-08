.class public final Lcom/roidapp/videolib/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/videolib/g;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/roidapp/videolib/k;

.field private d:Z

.field private e:Landroid/os/Handler;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/roidapp/videolib/h;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/h;-><init>(Lcom/roidapp/videolib/g;)V

    iput-object v0, p0, Lcom/roidapp/videolib/g;->e:Landroid/os/Handler;

    .line 25
    iput-object p1, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    .line 26
    return-void
.end method

.method static synthetic a(Lcom/roidapp/videolib/g;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/roidapp/videolib/g;->e:Landroid/os/Handler;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/roidapp/videolib/g;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/roidapp/videolib/g;->a:Lcom/roidapp/videolib/g;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Lcom/roidapp/videolib/g;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/g;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/videolib/g;->a:Lcom/roidapp/videolib/g;

    .line 17
    :cond_0
    sget-object v0, Lcom/roidapp/videolib/g;->a:Lcom/roidapp/videolib/g;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/videolib/g;ZLjava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 11
    .line 1125
    iget-boolean v0, p0, Lcom/roidapp/videolib/g;->d:Z

    if-eqz v0, :cond_1

    .line 1126
    iput-boolean v1, p0, Lcom/roidapp/videolib/g;->d:Z

    .line 1129
    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1130
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Z)V

    .line 1132
    :cond_0
    const-string v0, "UnsatisfiedLinkError"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 1133
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/e;->b(Landroid/content/Context;Z)V

    .line 1137
    :goto_0
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    .line 1139
    iget-object v0, p0, Lcom/roidapp/videolib/g;->c:Lcom/roidapp/videolib/k;

    if-eqz v0, :cond_1

    .line 1140
    iget-object v0, p0, Lcom/roidapp/videolib/g;->c:Lcom/roidapp/videolib/k;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/videolib/k;->a(ZLjava/lang/String;)V

    .line 11
    :cond_1
    return-void

    .line 1135
    :cond_2
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/roidapp/videolib/e;->b(Landroid/content/Context;Z)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/roidapp/videolib/k;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/roidapp/videolib/g;->c:Lcom/roidapp/videolib/k;

    .line 43
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 34
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/videolib/e;->c(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 38
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    iget-object v0, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/videolib/e;->d(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 13

    .prologue
    const/4 v2, 0x0

    const/16 v4, 0x280

    const/4 v12, 0x1

    .line 78
    iget-boolean v0, p0, Lcom/roidapp/videolib/g;->d:Z

    if-eqz v0, :cond_0

    .line 118
    :goto_0
    return-void

    .line 81
    :cond_0
    iput-boolean v12, p0, Lcom/roidapp/videolib/g;->d:Z

    .line 82
    iget-object v0, p0, Lcom/roidapp/videolib/g;->e:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/videolib/i;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/i;-><init>(Lcom/roidapp/videolib/g;)V

    const-wide/16 v6, 0x3a98

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 91
    new-instance v0, Lcom/roidapp/videolib/core/a/a;

    const-string v1, "test"

    const-wide/16 v6, 0x0

    const-wide/32 v8, 0xf4240

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v3, v2

    move v5, v4

    invoke-direct/range {v0 .. v11}, Lcom/roidapp/videolib/core/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;IIJJIZ)V

    .line 92
    iget-object v1, p0, Lcom/roidapp/videolib/g;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/videolib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/videolib/core/a/c;

    move-result-object v1

    new-instance v2, Lcom/roidapp/videolib/j;

    invoke-direct {v2, p0}, Lcom/roidapp/videolib/j;-><init>(Lcom/roidapp/videolib/g;)V

    invoke-interface {v1, v12, v0, v2}, Lcom/roidapp/videolib/core/a/c;->a(ZLcom/roidapp/videolib/core/a/a;Lcom/roidapp/videolib/core/a/b;)V

    goto :goto_0
.end method
