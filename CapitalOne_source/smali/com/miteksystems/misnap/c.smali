.class final Lcom/miteksystems/misnap/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/b;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/b;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/c;->a:Lcom/miteksystems/misnap/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/c;->a:Lcom/miteksystems/misnap/b;

    invoke-static {v0, p0}, Lcom/miteksystems/misnap/b;->a(Lcom/miteksystems/misnap/b;Ljava/lang/Runnable;)V

    return-void
.end method
