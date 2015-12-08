.class final Lkik/android/d/i;
.super Lkik/android/d/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/d/d;


# direct methods
.method constructor <init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V
    .locals 7

    .prologue
    .line 228
    iput-object p1, p0, Lkik/android/d/i;->a:Lkik/android/d/d;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lkik/android/d/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 232
    sget v0, Lkik/android/d/b$a;->b:I

    return v0
.end method

.method protected final a(Lkik/android/util/ar;)V
    .locals 0

    .prologue
    .line 266
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 228
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lkik/android/d/i;->a:Lkik/android/d/d;

    invoke-static {v1}, Lkik/android/d/d;->b(Lkik/android/d/d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lkik/android/d/j;

    invoke-direct {v1, p0}, Lkik/android/d/j;-><init>(Lkik/android/d/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic b(Lkik/android/util/ar;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
