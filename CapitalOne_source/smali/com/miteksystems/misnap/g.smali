.class final Lcom/miteksystems/misnap/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/MiSnap;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/g;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/g;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->d(Lcom/miteksystems/misnap/MiSnap;)V

    return-void
.end method
