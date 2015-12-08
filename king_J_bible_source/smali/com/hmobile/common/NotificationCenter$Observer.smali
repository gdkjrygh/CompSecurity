.class Lcom/hmobile/common/NotificationCenter$Observer;
.super Ljava/lang/Object;
.source "NotificationCenter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/common/NotificationCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Observer"
.end annotation


# instance fields
.field public Clazz:Ljava/lang/Object;

.field public MethodName:Ljava/lang/String;

.field public NotificationType:Ljava/lang/String;

.field public Params:[Ljava/lang/Object;

.field final synthetic this$0:Lcom/hmobile/common/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/hmobile/common/NotificationCenter;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0
    .param p2, "cls"    # Ljava/lang/Object;
    .param p3, "notificationType"    # Ljava/lang/String;
    .param p4, "methodName"    # Ljava/lang/String;
    .param p5, "objs"    # [Ljava/lang/Object;

    .prologue
    .line 100
    iput-object p1, p0, Lcom/hmobile/common/NotificationCenter$Observer;->this$0:Lcom/hmobile/common/NotificationCenter;

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p2, p0, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    .line 102
    iput-object p4, p0, Lcom/hmobile/common/NotificationCenter$Observer;->MethodName:Ljava/lang/String;

    .line 103
    iput-object p3, p0, Lcom/hmobile/common/NotificationCenter$Observer;->NotificationType:Ljava/lang/String;

    .line 104
    iput-object p5, p0, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    .line 105
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lcom/hmobile/common/NotificationCenter$Observer;

    if-ne v2, v3, :cond_0

    move-object v0, p1

    .line 115
    check-cast v0, Lcom/hmobile/common/NotificationCenter$Observer;

    .line 116
    .local v0, "newObserver":Lcom/hmobile/common/NotificationCenter$Observer;
    iget-object v2, v0, Lcom/hmobile/common/NotificationCenter$Observer;->NotificationType:Ljava/lang/String;

    .line 117
    iget-object v3, p0, Lcom/hmobile/common/NotificationCenter$Observer;->NotificationType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 128
    .end local v0    # "newObserver":Lcom/hmobile/common/NotificationCenter$Observer;
    :cond_0
    :goto_0
    return v1

    .line 120
    .restart local v0    # "newObserver":Lcom/hmobile/common/NotificationCenter$Observer;
    :cond_1
    iget-object v2, v0, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Lcom/hmobile/common/NotificationCenter$Observer;->Clazz:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    .line 121
    iget-object v2, v0, Lcom/hmobile/common/NotificationCenter$Observer;->MethodName:Ljava/lang/String;

    .line 122
    iget-object v3, p0, Lcom/hmobile/common/NotificationCenter$Observer;->MethodName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 123
    iget-object v2, p0, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    iget-object v3, v0, Lcom/hmobile/common/NotificationCenter$Observer;->Params:[Ljava/lang/Object;

    if-ne v2, v3, :cond_0

    .line 124
    const/4 v1, 0x1

    goto :goto_0
.end method
