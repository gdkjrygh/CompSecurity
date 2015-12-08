.class final Lcom/arist/model/skin/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/skin/b;

.field private final synthetic b:[I

.field private final synthetic c:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/arist/model/skin/b;[ILandroid/app/AlertDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/c;->a:Lcom/arist/model/skin/b;

    iput-object p2, p0, Lcom/arist/model/skin/c;->b:[I

    iput-object p3, p0, Lcom/arist/model/skin/c;->c:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/skin/c;->a:Lcom/arist/model/skin/b;

    iget-object v0, p0, Lcom/arist/model/skin/c;->b:[I

    aget v0, v0, p3

    sget-object v1, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v1, v0}, Lcom/arist/c/f;->f(I)V

    iget-object v0, p0, Lcom/arist/model/skin/c;->a:Lcom/arist/model/skin/b;

    iget-object v1, p0, Lcom/arist/model/skin/c;->b:[I

    aget v1, v1, p3

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/b;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/c;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
