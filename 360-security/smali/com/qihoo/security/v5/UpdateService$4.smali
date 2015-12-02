.class Lcom/qihoo/security/v5/UpdateService$4;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdateService;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/UpdateService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 572
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateService$4;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 579
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/a;->a()Lcom/qihoo/security/opti/trashclear/a;

    .line 580
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/a;->c()V

    .line 581
    return-void
.end method
