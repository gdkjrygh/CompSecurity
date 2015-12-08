.class public final Lcom/roidapp/photogrid/release/ln;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/roidapp/photogrid/release/ln;


# instance fields
.field private a:I

.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    .line 16
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/release/ln;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/roidapp/photogrid/release/ln;->d:Lcom/roidapp/photogrid/release/ln;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/roidapp/photogrid/release/ln;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ln;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/ln;->d:Lcom/roidapp/photogrid/release/ln;

    .line 31
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/ln;->d:Lcom/roidapp/photogrid/release/ln;

    return-object v0
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 38
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    .line 61
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ln;->c:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/roidapp/photogrid/release/ln;->a:I

    return v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/roidapp/photogrid/release/ln;->a:I

    .line 55
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/ln;->a:I

    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 66
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ln;->b:Landroid/util/SparseArray;

    .line 67
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ln;->c:Ljava/lang/String;

    .line 68
    sput-object v1, Lcom/roidapp/photogrid/release/ln;->d:Lcom/roidapp/photogrid/release/ln;

    .line 69
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ln;->c:Ljava/lang/String;

    return-object v0
.end method
