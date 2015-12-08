.class public final Lcom/c/a/b/m$a;
.super Lcom/c/a/b/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 636
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/a/b/m$a;-><init>(B)V

    .line 637
    return-void
.end method

.method private constructor <init>(B)V
    .locals 0

    .prologue
    .line 641
    invoke-direct {p0}, Lcom/c/a/b/k$a;-><init>()V

    .line 642
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Lcom/c/a/b/k$a;
    .locals 0

    .prologue
    .line 630
    invoke-super {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/lang/Object;)Lcom/c/a/b/k$a;

    return-object p0
.end method

.method public final bridge synthetic a(Ljava/util/Iterator;)Lcom/c/a/b/k$b;
    .locals 0

    .prologue
    .line 630
    invoke-super {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/util/Iterator;)Lcom/c/a/b/k$b;

    return-object p0
.end method

.method public final synthetic b(Ljava/lang/Object;)Lcom/c/a/b/k$b;
    .locals 0

    .prologue
    .line 630
    invoke-super {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/lang/Object;)Lcom/c/a/b/k$a;

    return-object p0
.end method

.method public final b(Ljava/util/Iterator;)Lcom/c/a/b/m$a;
    .locals 0

    .prologue
    .line 691
    invoke-super {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/util/Iterator;)Lcom/c/a/b/k$b;

    .line 692
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Lcom/c/a/b/m$a;
    .locals 0

    .prologue
    .line 652
    invoke-super {p0, p1}, Lcom/c/a/b/k$a;->a(Ljava/lang/Object;)Lcom/c/a/b/k$a;

    .line 653
    return-object p0
.end method
