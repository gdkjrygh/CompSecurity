.class final Lcom/ijoysoft/appwall/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ijoysoft/appwall/w;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/GiftActivity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/GiftActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/k;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/appwall/k;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-virtual {v0, p1}, Lcom/ijoysoft/appwall/GiftActivity;->b(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method
