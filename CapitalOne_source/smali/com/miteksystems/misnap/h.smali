.class final Lcom/miteksystems/misnap/h;
.super Landroid/view/OrientationEventListener;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/MiSnap;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lcom/miteksystems/misnap/h;->a:Lcom/miteksystems/misnap/MiSnap;

    const/4 v0, 0x3

    invoke-direct {p0, p2, v0}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/h;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0, p1}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;I)V

    return-void
.end method
