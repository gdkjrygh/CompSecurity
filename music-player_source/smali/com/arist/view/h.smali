.class final Lcom/arist/view/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/view/e;


# direct methods
.method constructor <init>(Lcom/arist/view/e;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/view/h;->a:Lcom/arist/view/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    add-int/lit8 v0, p2, 0x1

    sput v0, Lcom/arist/activity/MyApplication;->i:I

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1, v0}, Lcom/arist/c/f;->c(I)V

    iget-object v0, p0, Lcom/arist/view/h;->a:Lcom/arist/view/e;

    invoke-virtual {v0}, Lcom/arist/view/e;->a()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
