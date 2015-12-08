.class final Lcom/arist/model/errorinfo/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/model/errorinfo/c;


# direct methods
.method constructor <init>(Lcom/arist/model/errorinfo/c;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/errorinfo/d;->a:Lcom/arist/model/errorinfo/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/errorinfo/d;->a:Lcom/arist/model/errorinfo/c;

    sget-object v1, Lcom/arist/c/a;->M:Ljava/lang/String;

    iget-object v2, p0, Lcom/arist/model/errorinfo/d;->a:Lcom/arist/model/errorinfo/c;

    iget-object v2, v2, Lcom/arist/model/errorinfo/c;->d:Lcom/arist/model/errorinfo/b;

    invoke-virtual {v0, v1, v2}, Lcom/arist/model/errorinfo/c;->a(Ljava/lang/String;Lcom/arist/model/errorinfo/b;)V

    return-void
.end method
