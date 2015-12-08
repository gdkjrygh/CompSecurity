.class final Lcom/roidapp/imagelib/filter/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/FilterListView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/FilterListView;)V
    .locals 0

    .prologue
    .line 332
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/i;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 337
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 338
    return-void
.end method
