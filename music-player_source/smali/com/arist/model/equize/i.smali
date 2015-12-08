.class final Lcom/arist/model/equize/i;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/equize/a;


# direct methods
.method constructor <init>(Lcom/arist/model/equize/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/equize/i;->a:Lcom/arist/model/equize/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
