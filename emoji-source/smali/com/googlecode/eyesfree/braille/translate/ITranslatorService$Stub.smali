.class public abstract Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;
.super Landroid/os/Binder;
.source "ITranslatorService.java"

# interfaces
.implements Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.googlecode.eyesfree.braille.translate.ITranslatorService"

.field static final TRANSACTION_backTranslate:I = 0x4

.field static final TRANSACTION_checkTable:I = 0x2

.field static final TRANSACTION_setCallback:I = 0x1

.field static final TRANSACTION_translate:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p0, p0, v0}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

    .prologue
    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 30
    :goto_0
    return-object v0

    .line 26
    :cond_0
    const-string v1, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 27
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    goto :goto_0

    .line 30
    :cond_1
    new-instance v0, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub$Proxy;

    .end local v0    # "iin":Landroid/os/IInterface;
    invoke-direct {v0, p0}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v4, 0x1

    .line 38
    sparse-switch p1, :sswitch_data_0

    .line 89
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v4

    :goto_0
    return v4

    .line 42
    :sswitch_0
    const-string v3, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :sswitch_1
    const-string v3, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback;

    move-result-object v0

    .line 50
    .local v0, "_arg0":Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback;
    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->setCallback(Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback;)V

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 56
    .end local v0    # "_arg0":Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback;
    :sswitch_2
    const-string v3, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 59
    .local v0, "_arg0":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->checkTable(Ljava/lang/String;)Z

    move-result v2

    .line 60
    .local v2, "_result":Z
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    if-eqz v2, :cond_0

    move v3, v4

    :goto_1
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    .line 66
    .end local v0    # "_arg0":Ljava/lang/String;
    .end local v2    # "_result":Z
    :sswitch_3
    const-string v3, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 70
    .restart local v0    # "_arg0":Ljava/lang/String;
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 71
    .local v1, "_arg1":Ljava/lang/String;
    invoke-virtual {p0, v0, v1}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->translate(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v2

    .line 72
    .local v2, "_result":[B
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 73
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    .line 78
    .end local v0    # "_arg0":Ljava/lang/String;
    .end local v1    # "_arg1":Ljava/lang/String;
    .end local v2    # "_result":[B
    :sswitch_4
    const-string v3, "com.googlecode.eyesfree.braille.translate.ITranslatorService"

    invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 80
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    .line 82
    .local v0, "_arg0":[B
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 83
    .restart local v1    # "_arg1":Ljava/lang/String;
    invoke-virtual {p0, v0, v1}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->backTranslate([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 84
    .local v2, "_result":Ljava/lang/String;
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 38
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
