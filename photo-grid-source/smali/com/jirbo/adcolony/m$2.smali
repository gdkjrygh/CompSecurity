.class Lcom/jirbo/adcolony/m$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$OnScanCompletedListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/m;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/m;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/jirbo/adcolony/m$2;->a:Lcom/jirbo/adcolony/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 3

    .prologue
    .line 190
    iget-object v0, p0, Lcom/jirbo/adcolony/m$2;->a:Lcom/jirbo/adcolony/m;

    iget-object v0, v0, Lcom/jirbo/adcolony/m;->b:Landroid/app/Activity;

    const-string v1, "Screenshot saved to Gallery!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 191
    return-void
.end method
