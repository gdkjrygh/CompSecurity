.class public final Lcom/roidapp/photogrid/release/qx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/roidapp/photogrid/release/qx;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/qz;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lcom/roidapp/photogrid/release/qx;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/qx;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/qx;->c:Lcom/roidapp/photogrid/release/qx;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    .line 17
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/release/qx;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/roidapp/photogrid/release/qx;->c:Lcom/roidapp/photogrid/release/qx;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/roidapp/photogrid/release/qx;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/qx;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/qx;->c:Lcom/roidapp/photogrid/release/qx;

    .line 23
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/qx;->c:Lcom/roidapp/photogrid/release/qx;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/roidapp/photogrid/release/qz;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    return-object v0
.end method

.method public final a(Lcom/roidapp/photogrid/release/qz;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final b(Lcom/roidapp/photogrid/release/qz;)V
    .locals 3

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 54
    if-ltz v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 1035
    iget-object v2, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 1036
    iget-object v2, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 58
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 41
    if-ltz v0, :cond_0

    .line 42
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 43
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 46
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 66
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 68
    iget-object v0, v0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 72
    :goto_1
    return v0

    .line 66
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qx;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 83
    return-void
.end method
