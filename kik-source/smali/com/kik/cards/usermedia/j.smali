.class final Lcom/kik/cards/usermedia/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:[Ljava/lang/CharSequence;

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lcom/kik/cards/usermedia/h;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/h;[Ljava/lang/CharSequence;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/kik/cards/usermedia/j;->c:Lcom/kik/cards/usermedia/h;

    iput-object p2, p0, Lcom/kik/cards/usermedia/j;->a:[Ljava/lang/CharSequence;

    iput-object p3, p0, Lcom/kik/cards/usermedia/j;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 54
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/kik/cards/usermedia/j;->a:[Ljava/lang/CharSequence;

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 55
    iget-object v0, p0, Lcom/kik/cards/usermedia/j;->b:Lcom/kik/g/p;

    const-string v1, "camera"

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 61
    :goto_0
    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/j;->b:Lcom/kik/g/p;

    const-string v1, "gallery"

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
