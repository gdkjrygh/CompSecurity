.class final Lcom/roidapp/photogrid/release/qe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/Preference;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 764
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qe;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 767
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 768
    return-void
.end method
