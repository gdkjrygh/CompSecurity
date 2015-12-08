.class final Lcom/ijoysoft/appwall/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/GiftActivity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/GiftActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/m;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/m;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/GiftActivity;->finish()V

    return-void
.end method
