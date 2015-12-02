.class public Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Externalizable;


# instance fields
.field private exampleNumber_:Ljava/lang/String;

.field private hasExampleNumber:Z

.field private hasNationalNumberPattern:Z

.field private hasPossibleNumberPattern:Z

.field private nationalNumberPattern_:Ljava/lang/String;

.field private possibleNumberPattern_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->nationalNumberPattern_:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->possibleNumberPattern_:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->exampleNumber_:Ljava/lang/String;

    return-void
.end method

.method public static newBuilder()Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc$Builder;
    .locals 1

    new-instance v0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc$Builder;

    invoke-direct {v0}, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getNationalNumberPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->nationalNumberPattern_:Ljava/lang/String;

    return-object v0
.end method

.method public getPossibleNumberPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->possibleNumberPattern_:Ljava/lang/String;

    return-object v0
.end method

.method public hasNationalNumberPattern()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern:Z

    return v0
.end method

.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    invoke-interface {p1}, Ljava/io/ObjectInput;->readBoolean()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/io/ObjectInput;->readUTF()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->setNationalNumberPattern(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;

    :cond_0
    invoke-interface {p1}, Ljava/io/ObjectInput;->readBoolean()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/io/ObjectInput;->readUTF()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->setPossibleNumberPattern(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;

    :cond_1
    invoke-interface {p1}, Ljava/io/ObjectInput;->readBoolean()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/io/ObjectInput;->readUTF()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->setExampleNumber(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;

    :cond_2
    return-void
.end method

.method public setExampleNumber(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasExampleNumber:Z

    iput-object p1, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->exampleNumber_:Ljava/lang/String;

    return-object p0
.end method

.method public setNationalNumberPattern(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern:Z

    iput-object p1, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->nationalNumberPattern_:Ljava/lang/String;

    return-object p0
.end method

.method public setPossibleNumberPattern(Ljava/lang/String;)Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasPossibleNumberPattern:Z

    iput-object p1, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->possibleNumberPattern_:Ljava/lang/String;

    return-object p0
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern:Z

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeBoolean(Z)V

    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->nationalNumberPattern_:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeUTF(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasPossibleNumberPattern:Z

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeBoolean(Z)V

    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasPossibleNumberPattern:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->possibleNumberPattern_:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeUTF(Ljava/lang/String;)V

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasExampleNumber:Z

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeBoolean(Z)V

    iget-boolean v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasExampleNumber:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/phonenumbers/Phonemetadata$PhoneNumberDesc;->exampleNumber_:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeUTF(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
