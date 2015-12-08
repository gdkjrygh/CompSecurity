.class final Lcom/roidapp/photogrid/release/lx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PathSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PathSelector;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lx;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 227
    check-cast p1, Lcom/roidapp/photogrid/release/lu;

    .line 228
    check-cast p2, Lcom/roidapp/photogrid/release/lu;

    .line 229
    iget-object v0, p1, Lcom/roidapp/photogrid/release/lu;->a:Ljava/lang/String;

    iget-object v1, p2, Lcom/roidapp/photogrid/release/lu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
