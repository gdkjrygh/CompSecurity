.class final Lcom/miteksystems/misnap/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/l;

.field private final synthetic b:Landroid/view/SurfaceHolder;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/l;Landroid/view/SurfaceHolder;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/p;->a:Lcom/miteksystems/misnap/l;

    iput-object p2, p0, Lcom/miteksystems/misnap/p;->b:Landroid/view/SurfaceHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/miteksystems/misnap/p;->a:Lcom/miteksystems/misnap/l;

    iget-object v1, p0, Lcom/miteksystems/misnap/p;->b:Landroid/view/SurfaceHolder;

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/l;->a(Lcom/miteksystems/misnap/l;Landroid/view/SurfaceHolder;)V

    return-void
.end method
