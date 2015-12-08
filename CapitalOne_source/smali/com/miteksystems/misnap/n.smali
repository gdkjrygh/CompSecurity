.class final Lcom/miteksystems/misnap/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/l;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/l;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/n;->a:Lcom/miteksystems/misnap/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/miteksystems/misnap/n;->a:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->c()V

    return-void
.end method
