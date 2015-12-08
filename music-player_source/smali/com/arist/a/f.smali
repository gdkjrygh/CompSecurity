.class final Lcom/arist/a/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/a/e;

.field private final synthetic b:I


# direct methods
.method constructor <init>(Lcom/arist/a/e;I)V
    .locals 0

    iput-object p1, p0, Lcom/arist/a/f;->a:Lcom/arist/a/e;

    iput p2, p0, Lcom/arist/a/f;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/arist/a/f;->a:Lcom/arist/a/e;

    invoke-static {v0}, Lcom/arist/a/e;->a(Lcom/arist/a/e;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/activity/MainActivity;

    const/4 v1, 0x1

    iget v2, p0, Lcom/arist/a/f;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/arist/activity/MainActivity;->a(II)V

    return-void
.end method
