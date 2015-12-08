.class final Lcom/arist/model/equize/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;

.field private final synthetic b:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/g;->a:Lcom/arist/model/equize/a;

    iput-object p2, p0, Lcom/arist/model/equize/g;->b:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object v0, p0, Lcom/arist/model/equize/g;->a:Lcom/arist/model/equize/a;

    invoke-static {v0}, Lcom/arist/model/equize/a;->a(Lcom/arist/model/equize/a;)Lcom/arist/model/equize/j;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/arist/model/equize/j;->a(I)V

    iget-object v0, p0, Lcom/arist/model/equize/g;->a:Lcom/arist/model/equize/a;

    invoke-static {v0}, Lcom/arist/model/equize/a;->b(Lcom/arist/model/equize/a;)Lcom/arist/activity/EqualizerActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/equize/g;->b:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Lcom/arist/activity/EqualizerActivity;->b(Ljava/lang/String;)V

    return-void
.end method
