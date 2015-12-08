.class final Lcom/arist/model/equize/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;

.field private final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/b;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/b;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v2, p0, Lcom/arist/model/equize/b;->a:Lcom/arist/model/equize/a;

    iget-object v0, p0, Lcom/arist/model/equize/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/a;

    const/16 v1, 0x17

    if-lt p2, v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v2, v0, v1}, Lcom/arist/model/equize/a;->a(Lcom/arist/b/a;Z)V

    return-void

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method
