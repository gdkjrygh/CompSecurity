.class Lcom/qihoo/security/ui/main/BoosterFragment$d;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 895
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$d;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V
    .locals 0

    .prologue
    .line 895
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$d;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 900
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$d;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$d;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->h(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/nineoldandroids/a/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 901
    return-void
.end method
