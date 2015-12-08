.class final Lcom/arist/activity/o;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private final synthetic b:Landroid/app/Dialog;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/o;->a:Lcom/arist/activity/MainActivity;

    iput-object p2, p0, Lcom/arist/activity/o;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/o;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/arist/activity/o;->a:Lcom/arist/activity/MainActivity;

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->f()V

    return-void
.end method
