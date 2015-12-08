.class final Lcom/arist/activity/ak;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/ScanMusicActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/ScanMusicActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ak;->a:Lcom/arist/activity/ScanMusicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/arist/activity/ak;->a:Lcom/arist/activity/ScanMusicActivity;

    invoke-virtual {v0}, Lcom/arist/activity/ScanMusicActivity;->a()V

    return-void
.end method
