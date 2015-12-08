.class final Lcom/arist/activity/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/activity/EqualizerActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/EqualizerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/g;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/g;->a:Lcom/arist/activity/EqualizerActivity;

    iget-object v1, p0, Lcom/arist/activity/g;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-static {v1}, Lcom/arist/activity/EqualizerActivity;->a(Lcom/arist/activity/EqualizerActivity;)Lcom/arist/model/equize/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->a()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/activity/EqualizerActivity;->a(F)V

    return-void
.end method
