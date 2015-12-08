.class public final Lcom/kik/sdkutils/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/support/v4/app/Fragment;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 65
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 67
    new-instance v1, Lcom/kik/sdkutils/i;

    invoke-direct {v1, p0, v0}, Lcom/kik/sdkutils/i;-><init>(Landroid/support/v4/app/Fragment;Lcom/kik/g/p;)V

    invoke-virtual {p1, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 124
    return-object v0
.end method

.method public static a(Landroid/view/View;Lcom/kik/g/p;)Lcom/kik/g/p;
    .locals 2

    .prologue
    .line 19
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 21
    new-instance v1, Lcom/kik/sdkutils/e;

    invoke-direct {v1, p0, v0}, Lcom/kik/sdkutils/e;-><init>(Landroid/view/View;Lcom/kik/g/p;)V

    invoke-virtual {p1, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 60
    return-object v0
.end method

.method public static a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;
    .locals 1

    .prologue
    .line 283
    new-instance v0, Lcom/kik/sdkutils/s;

    invoke-direct {v0, p0, p1}, Lcom/kik/sdkutils/s;-><init>(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)V

    .line 376
    return-object v0
.end method

.method public static a(Landroid/view/View;Lcom/kik/g/r;)Lcom/kik/g/r;
    .locals 1

    .prologue
    .line 135
    new-instance v0, Lcom/kik/sdkutils/m;

    invoke-direct {v0, p0, p1}, Lcom/kik/sdkutils/m;-><init>(Landroid/view/View;Lcom/kik/g/r;)V

    .line 198
    return-object v0
.end method
