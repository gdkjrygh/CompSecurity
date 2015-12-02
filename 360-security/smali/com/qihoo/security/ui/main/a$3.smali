.class final Lcom/qihoo/security/ui/main/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroid/view/View;

.field final synthetic b:[Landroid/view/View;

.field final synthetic c:Lcom/nineoldandroids/a/b;


# direct methods
.method constructor <init>([Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lcom/qihoo/security/ui/main/a$3;->a:[Landroid/view/View;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/a$3;->b:[Landroid/view/View;

    iput-object p3, p0, Lcom/qihoo/security/ui/main/a$3;->c:Lcom/nineoldandroids/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 348
    const-string/jumbo v0, "AnimUtils"

    const-string/jumbo v1, "double click running..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 349
    const-wide/16 v0, 0x0

    iget-object v2, p0, Lcom/qihoo/security/ui/main/a$3;->a:[Landroid/view/View;

    iget-object v3, p0, Lcom/qihoo/security/ui/main/a$3;->b:[Landroid/view/View;

    iget-object v4, p0, Lcom/qihoo/security/ui/main/a$3;->c:Lcom/nineoldandroids/a/b;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J

    .line 350
    return-void
.end method
