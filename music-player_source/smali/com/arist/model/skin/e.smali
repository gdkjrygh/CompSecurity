.class final Lcom/arist/model/skin/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arist/model/skin/i;


# instance fields
.field final synthetic a:Lcom/arist/model/skin/b;

.field private final synthetic b:Lcom/arist/model/skin/g;


# direct methods
.method constructor <init>(Lcom/arist/model/skin/b;Lcom/arist/model/skin/g;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/e;->a:Lcom/arist/model/skin/b;

    iput-object p2, p0, Lcom/arist/model/skin/e;->b:Lcom/arist/model/skin/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/e;->a:Lcom/arist/model/skin/b;

    sget-object v0, Lcom/arist/activity/MyApplication;->e:Lcom/arist/c/f;

    invoke-virtual {v0, p1}, Lcom/arist/c/f;->f(I)V

    iget-object v0, p0, Lcom/arist/model/skin/e;->a:Lcom/arist/model/skin/b;

    invoke-virtual {v0, p1}, Lcom/arist/model/skin/b;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/e;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0}, Lcom/arist/model/skin/g;->dismiss()V

    return-void
.end method
