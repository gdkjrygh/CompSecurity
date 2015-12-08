.class final Lcom/ijoysoft/appwall/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ijoysoft/appwall/w;


# instance fields
.field private final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/b;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/ijoysoft/appwall/a;->a(Landroid/content/Context;Ljava/util/ArrayList;)V

    return-void
.end method
