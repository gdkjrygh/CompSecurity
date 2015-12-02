.class public Lcom/facebook/user/j;
.super Ljava/lang/Object;
.source "OrcaPhoneNumberUtil.java"


# instance fields
.field final synthetic a:Lcom/facebook/user/i;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;


# direct methods
.method public constructor <init>(Lcom/facebook/user/i;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p2, p0, Lcom/facebook/user/j;->b:Ljava/lang/String;

    .line 42
    invoke-direct {p0, p2}, Lcom/facebook/user/j;->a(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    .line 43
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;
    .locals 3

    .prologue
    .line 121
    const/4 v1, 0x0

    .line 122
    iget-object v0, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v0}, Lcom/facebook/user/i;->c(Lcom/facebook/user/i;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 123
    if-eqz p1, :cond_0

    .line 125
    :try_start_0
    iget-object v2, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v2}, Lcom/facebook/user/i;->a(Lcom/facebook/user/i;)Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;
    :try_end_0
    .catch Lcom/facebook/phonenumbers/NumberParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 130
    :goto_0
    return-object v0

    .line 126
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/facebook/user/UserPhoneNumber;
    .locals 3

    .prologue
    .line 114
    new-instance v0, Lcom/facebook/user/UserPhoneNumber;

    invoke-virtual {p0}, Lcom/facebook/user/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/user/j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/user/UserPhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    if-nez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/facebook/user/j;->b:Ljava/lang/String;

    .line 70
    :goto_0
    return-object v0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v0}, Lcom/facebook/user/i;->a(Lcom/facebook/user/i;)Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    invoke-virtual {v0, v1}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->isValidNumber(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/facebook/user/j;->b:Ljava/lang/String;

    goto :goto_0

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v0}, Lcom/facebook/user/i;->a(Lcom/facebook/user/i;)Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    sget-object v2, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->E164:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    if-nez v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/facebook/user/j;->b:Ljava/lang/String;

    .line 97
    :goto_0
    return-object v0

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v0}, Lcom/facebook/user/i;->b(Lcom/facebook/user/i;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/facebook/user/j;->a(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    move-result-object v0

    .line 89
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    invoke-virtual {v1}, Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 91
    :cond_1
    sget-object v0, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->INTERNATIONAL:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    .line 97
    :goto_1
    iget-object v1, p0, Lcom/facebook/user/j;->a:Lcom/facebook/user/i;

    invoke-static {v1}, Lcom/facebook/user/i;->a(Lcom/facebook/user/i;)Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/user/j;->c:Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->format(Lcom/facebook/phonenumbers/Phonenumber$PhoneNumber;Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    const/16 v2, 0xa0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2d

    const/16 v2, 0x2011

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 93
    :cond_2
    sget-object v0, Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->NATIONAL:Lcom/facebook/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;

    goto :goto_1
.end method

.method public d()Lcom/facebook/user/UserKey;
    .locals 3

    .prologue
    .line 106
    new-instance v0, Lcom/facebook/user/UserKey;

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {p0}, Lcom/facebook/user/j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    return-object v0
.end method
