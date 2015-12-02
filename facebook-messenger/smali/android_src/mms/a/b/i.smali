.class public Landroid_src/mms/a/b/i;
.super Landroid_src/mms/a/b/g;
.source "SmilMediaElementImpl.java"

# interfaces
.implements Lorg/a/a/b/i;


# instance fields
.field b:Lorg/a/a/b/d;


# direct methods
.method constructor <init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 127
    invoke-direct {p0, p1, p2}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 40
    new-instance v0, Landroid_src/mms/a/b/j;

    invoke-direct {v0, p0, p0}, Landroid_src/mms/a/b/j;-><init>(Landroid_src/mms/a/b/i;Lorg/a/a/b/g;)V

    iput-object v0, p0, Landroid_src/mms/a/b/i;->b:Lorg/a/a/b/d;

    .line 128
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .prologue
    .line 316
    iget-object v0, p0, Landroid_src/mms/a/b/i;->b:Lorg/a/a/b/d;

    invoke-interface {v0, p1}, Lorg/a/a/b/d;->a(F)V

    .line 317
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 236
    const-string v0, "src"

    invoke-virtual {p0, v0, p1}, Landroid_src/mms/a/b/i;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    return-void
.end method
