.class public Landroid_src/mms/a/b/k;
.super Landroid_src/mms/a/b/g;
.source "SmilParElementImpl.java"

# interfaces
.implements Lorg/a/a/b/j;


# instance fields
.field b:Lorg/a/a/b/b;


# direct methods
.method constructor <init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 36
    new-instance v0, Landroid_src/mms/a/b/l;

    invoke-direct {v0, p0, p0}, Landroid_src/mms/a/b/l;-><init>(Landroid_src/mms/a/b/k;Lorg/a/a/b/g;)V

    iput-object v0, p0, Landroid_src/mms/a/b/k;->b:Lorg/a/a/b/b;

    .line 100
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Landroid_src/mms/a/b/k;->b:Lorg/a/a/b/b;

    invoke-interface {v0, p1}, Lorg/a/a/b/b;->a(F)V

    .line 192
    return-void
.end method
