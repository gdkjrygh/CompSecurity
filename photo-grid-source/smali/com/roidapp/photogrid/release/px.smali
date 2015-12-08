.class final Lcom/roidapp/photogrid/release/px;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PickFolder;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PickFolder;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/roidapp/photogrid/release/px;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/px;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PickFolder;->c(Lcom/roidapp/photogrid/release/PickFolder;)Z

    .line 153
    return-void
.end method
