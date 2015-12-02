.class public Lcom/facebook/user/i;
.super Ljava/lang/Object;
.source "OrcaPhoneNumberUtil.java"


# instance fields
.field private final a:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/phonenumbers/PhoneNumberUtil;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/phonenumbers/PhoneNumberUtil;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/user/i;->a:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 28
    iput-object p2, p0, Lcom/facebook/user/i;->b:Ljavax/inject/a;

    .line 29
    iput-object p3, p0, Lcom/facebook/user/i;->c:Ljavax/inject/a;

    .line 30
    return-void
.end method

.method static synthetic a(Lcom/facebook/user/i;)Lcom/facebook/phonenumbers/PhoneNumberUtil;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/user/i;->a:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/user/i;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/user/i;->c:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/user/i;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/user/i;->b:Ljavax/inject/a;

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 168
    if-nez p0, :cond_0

    .line 169
    const/4 v0, 0x0

    .line 172
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "\\d"

    const-string v1, "X"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Lcom/facebook/user/UserPhoneNumber;
    .locals 1

    .prologue
    .line 158
    new-instance v0, Lcom/facebook/user/j;

    invoke-direct {v0, p0, p1}, Lcom/facebook/user/j;-><init>(Lcom/facebook/user/i;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/facebook/user/j;->a(I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/user/j;
    .locals 1

    .prologue
    .line 138
    new-instance v0, Lcom/facebook/user/j;

    invoke-direct {v0, p0, p1}, Lcom/facebook/user/j;-><init>(Lcom/facebook/user/i;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/user/j;

    invoke-direct {v0, p0, p1}, Lcom/facebook/user/j;-><init>(Lcom/facebook/user/i;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/user/j;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    new-instance v0, Lcom/facebook/user/j;

    invoke-direct {v0, p0, p1}, Lcom/facebook/user/j;-><init>(Lcom/facebook/user/i;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/user/j;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 154
    new-instance v0, Lcom/facebook/user/j;

    invoke-direct {v0, p0, p1}, Lcom/facebook/user/j;-><init>(Lcom/facebook/user/i;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/facebook/user/j;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    return-object v0
.end method
