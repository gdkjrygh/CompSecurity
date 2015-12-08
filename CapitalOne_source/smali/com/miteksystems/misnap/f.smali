.class final Lcom/miteksystems/misnap/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/MiSnap;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/f;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/miteksystems/misnap/f;->a:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->mobi_url:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/miteksystems/misnap/f;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v1, v0}, Lcom/miteksystems/misnap/MiSnap;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/f;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->finish()V

    return-void
.end method
