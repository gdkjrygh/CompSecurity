.class Lcom/qihoo/security/enginehelper/clean/a$10;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->a(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$10;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iput-object p2, p0, Lcom/qihoo/security/enginehelper/clean/a$10;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$10;->b:Lcom/qihoo/security/enginehelper/clean/a;

    iget-object v1, p0, Lcom/qihoo/security/enginehelper/clean/a$10;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 199
    return-void
.end method
