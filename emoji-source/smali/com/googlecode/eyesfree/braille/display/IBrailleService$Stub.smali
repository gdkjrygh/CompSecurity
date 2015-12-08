.class public abstract Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;
.super Landroid/os/Binder;
.source "IBrailleService.java"

# interfaces
.implements Lcom/googlecode/eyesfree/braille/display/IBrailleService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/display/IBrailleService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.googlecode.eyesfree.braille.display.IBrailleService"

.field static final TRANSACTION_displayDots:I = 0x3

.field static final TRANSACTION_registerCallback:I = 0x1

.field static final TRANSACTION_unregisterCallback:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 18
    const-string v0, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-virtual {p0, p0, v0}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 19
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    .locals 2
    .param p0, "obj"    # Landroid/os/IBinder;

    .prologue
    .line 26
    if-nez p0, :cond_0

    .line 27
    const/4 v0, 0x0

    .line 33
    :goto_0
    return-object v0

    .line 29
    :cond_0
    const-string v1, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 30
    .local v0, "iin":Landroid/os/IInterface;
    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    if-eqz v1, :cond_1

    .line 31
    check-cast v0, Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    goto :goto_0

    .line 33
    :cond_1
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub$Proxy;

    .end local v0    # "iin":Landroid/os/IInterface;
    invoke-direct {v0, p0}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .prologue
    .line 37
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
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
    const/4 v3, 0x1

    .line 41
    sparse-switch p1, :sswitch_data_0

    .line 76
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v3

    :goto_0
    return v3

    .line 45
    :sswitch_0
    const-string v2, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    .line 50
    :sswitch_1
    const-string v2, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;

    move-result-object v0

    .line 53
    .local v0, "_arg0":Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;
    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;->registerCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)Z

    move-result v1

    .line 54
    .local v1, "_result":Z
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 55
    if-eqz v1, :cond_0

    move v2, v3

    :goto_1
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    .line 60
    .end local v0    # "_arg0":Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;
    .end local v1    # "_result":Z
    :sswitch_2
    const-string v2, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 62
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;

    move-result-object v0

    .line 63
    .restart local v0    # "_arg0":Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;
    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;->unregisterCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)V

    goto :goto_0

    .line 68
    .end local v0    # "_arg0":Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;
    :sswitch_3
    const-string v2, "com.googlecode.eyesfree.braille.display.IBrailleService"

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    .line 71
    .local v0, "_arg0":[B
    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;->displayDots([B)V

    .line 72
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    .line 41
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
