.class final Lcom/roidapp/photogrid/release/ee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 655
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ee;->a:Lcom/roidapp/photogrid/release/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 658
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 659
    return-void
.end method
