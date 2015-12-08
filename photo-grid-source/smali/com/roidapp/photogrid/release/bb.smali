.class final Lcom/roidapp/photogrid/release/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/EffectsList;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/EffectsList;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bb;->a:Lcom/roidapp/photogrid/release/EffectsList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bb;->a:Lcom/roidapp/photogrid/release/EffectsList;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/EffectsList;->a(Lcom/roidapp/photogrid/release/EffectsList;)V

    .line 47
    return-void
.end method
