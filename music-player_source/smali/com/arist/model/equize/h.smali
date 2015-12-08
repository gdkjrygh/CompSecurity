.class final Lcom/arist/model/equize/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;

.field private final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/h;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/h;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/arist/model/equize/h;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/a;

    iget-object v1, p0, Lcom/arist/model/equize/h;->a:Lcom/arist/model/equize/a;

    invoke-static {v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;)Lcom/arist/model/equize/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/arist/model/equize/j;->a(Lcom/arist/b/a;)V

    iget-object v1, p0, Lcom/arist/model/equize/h;->a:Lcom/arist/model/equize/a;

    invoke-static {v1}, Lcom/arist/model/equize/a;->b(Lcom/arist/model/equize/a;)Lcom/arist/activity/EqualizerActivity;

    move-result-object v1

    iget-object v2, v0, Lcom/arist/b/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/arist/activity/EqualizerActivity;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/model/equize/h;->a:Lcom/arist/model/equize/a;

    invoke-static {v1}, Lcom/arist/model/equize/a;->b(Lcom/arist/model/equize/a;)Lcom/arist/activity/EqualizerActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/model/equize/h;->a:Lcom/arist/model/equize/a;

    invoke-virtual {v2}, Lcom/arist/model/equize/a;->f()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Lcom/arist/activity/EqualizerActivity;->a(Lcom/arist/b/a;F)V

    return-void
.end method
