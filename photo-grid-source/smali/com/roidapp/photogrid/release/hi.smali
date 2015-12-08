.class final Lcom/roidapp/photogrid/release/hi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hh;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hh;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hi;->a:Lcom/roidapp/photogrid/release/hh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 88
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 89
    return-void
.end method
