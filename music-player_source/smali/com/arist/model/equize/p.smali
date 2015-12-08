.class final Lcom/arist/model/equize/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/VisualizerView;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/VisualizerView;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/p;->a:Lcom/arist/model/equize/VisualizerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/arist/model/equize/p;->a:Lcom/arist/model/equize/VisualizerView;

    invoke-virtual {v0}, Lcom/arist/model/equize/VisualizerView;->postInvalidate()V

    iget-object v0, p0, Lcom/arist/model/equize/p;->a:Lcom/arist/model/equize/VisualizerView;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, p0, v2, v3}, Lcom/arist/model/equize/VisualizerView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
